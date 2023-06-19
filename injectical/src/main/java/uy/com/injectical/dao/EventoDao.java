package uy.com.injectical.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.mysql.cj.xdevapi.SqlResultBuilder;

import uy.com.injectical.entity.Detalles;
import uy.com.injectical.entity.Disciplina;
import uy.com.injectical.entity.Evento;

public class EventoDao {

	private static final String SQL_ALL_EVENTS_DISCIPLINE = "SELECT * FROM evento_disciplina";
	private static final String SQL_DETAILS = "SELECT * FROM evento_detalle where id_evento = ?";

	private DbConnection conn;

	public EventoDao(DbConnection conn) {
		this.conn = conn;
	}

	public Collection<Evento> getEventos() throws SQLException, IOException {
		Collection<Evento> result = new ArrayList<>();
		conn.setPropertiesConnection();
		PreparedStatement ps = conn.getConn().prepareStatement(SQL_ALL_EVENTS_DISCIPLINE);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			result.add(
					new Evento(Integer.valueOf(rs.getInt("id_evento")), rs.getNString("pais"), rs.getNString("nombre"),
							rs.getDate("fecha_inicio"), null, rs.getInt("inicio") == 1, rs.getInt("final") == 1,
							new Disciplina(rs.getInt("id_disciplina"), rs.getNString("nombre_disciplina")),
							this.getDetalles(rs.getInt("id_evento"))));
		}

		return result;
	}

	public Collection<Detalles> getDetalles(Integer idEvento) throws SQLException {
		Collection<Detalles> result = new ArrayList<>();
		PreparedStatement ps = conn.getConn().prepareStatement(SQL_DETAILS);
		ps.setString(1, idEvento.toString());
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			result.add(new Detalles(rs.getInt("id_detalles"), rs.getNString("nombre_det")));
		}
		return result;
	}
}
