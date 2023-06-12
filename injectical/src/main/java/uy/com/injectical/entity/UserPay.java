package uy.com.injectical.entity;

import java.util.Date;

public class UserPay extends UserGral implements UserService{

	private boolean pay;
	private Date datePay;
	
	public UserPay() {super();}
	public UserPay(String name, String email, String codeName, Integer id, String lastName,boolean pay) {
		super(name, email, codeName, id, lastName);
		this.pay = pay; 
	}
	
	public boolean isPay() {
		return pay;
	}
	public void setPay(boolean pay) {
		this.pay = pay;
	}
	public Date getDatePay() {
		return datePay;
	}
	public void setDatePay(Date datePay) {
		this.datePay = datePay;
	}
	
	@Override public Integer getUserRol() {	return ROL_USER_PAY;}
	
}
