package com.isa.ws.entities;


public class VerifyResponse {
	
	private Signature[] signatures;
	private boolean valida;

	public boolean isValida() {
		return valida;
	}

	public void setValida(boolean valida) {
		this.valida = valida;
	}

	public Signature[] getSignatures() {
		return signatures;
	}

	public void setSignatures(Signature[] signatures) {
		this.signatures = signatures;
	}
	

}
