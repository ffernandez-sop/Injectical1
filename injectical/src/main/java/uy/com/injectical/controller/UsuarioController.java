package uy.com.injectical.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import uy.com.injectical.dao.DbConnection;
import uy.com.injectical.dao.EventoDao;
import uy.com.injectical.entity.Evento;

/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {

	private static final long serialVersionUID = 2341228929334652220L;


	public UsuarioController() {
        super();
    
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd;
		EventoDao eventoDao = new EventoDao(DbConnection.getInstance());
		Collection<Evento> lista =new ArrayList<>();
		try {
			lista = eventoDao.getEventos();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		request.setAttribute("allEventos", lista);
		rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
