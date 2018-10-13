package com.etc.RentMarket.entity;

import java.io.Serializable;

 
/**
 * The persistent class for the admin database table.
 * 
 */
 
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	private String admin;

	private String adminPwd;

	public Admin() {
	}

	public String getAdmin() {
		return this.admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getAdminPwd() {
		return this.adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public Admin(String admin, String adminPwd) {
		super();
		this.admin = admin;
		this.adminPwd = adminPwd;
	}

	@Override
	public String toString() {
		return "Admin [admin=" + admin + ", adminPwd=" + adminPwd + "]";
	}

}