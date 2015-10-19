package com.isa.ws.entities;

import java.util.Date;

public class Signature {

	private String cn;
	private Date fecha;
	private boolean verify;
	
	
	public boolean isVerify() {
		return verify;
	}
	public void setVerify(boolean verify) {
		this.verify = verify;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
