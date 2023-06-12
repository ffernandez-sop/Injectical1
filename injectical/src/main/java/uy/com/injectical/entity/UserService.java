package uy.com.injectical.entity;

public interface UserService {
	
	static final Integer ROL_USER_PAY	= 1;
	static final Integer ROL_USER_ADM	= 2;
	static final Integer ROL_USER_FREE	= 3;
	static final Integer ROL_USER_ROOT	= 4;
	
	public Integer getUserRol();
}
