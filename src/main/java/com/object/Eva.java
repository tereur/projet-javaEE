package com.object;

public class Eva {
	private String faceva;
private String nomeva;
private int dureeva;
private String heurefinEva;
private String heuredebEva;
private String sessionEva;
private int nbs;
private String[] salle;
private String[] uv;
private int nbf;
	public Eva() {
		// TODO Auto-generated constructor stub
		faceva=null;
		nomeva=null;
		dureeva=0;
		heurefinEva="00-00";
		heuredebEva="00-00";
		sessionEva=null;
		nbs=0;
		nbf=0;
	}
	public int getDureeva() {
		return dureeva;
	}
	public void setDureeva(int dureeva) {
		this.dureeva = dureeva;
	}
	public String getNomeva() {
		return nomeva;
	}
	public void setNomeva(String nomeva) {
		this.nomeva = nomeva;
	}
	public String getHeurefinEva() {
		return heurefinEva;
	}
	public void setHeurefinEva(String heurefinEva) {
		this.heurefinEva = heurefinEva;
	}
	public String getHeuredebEva() {
		return heuredebEva;
	}
	public void setHeuredebEva(String heuredebEva) {
		this.heuredebEva = heuredebEva;
	}
	public String getSessionEva() {
		return sessionEva;
	}
	public void setSessionEva(String sessionEva) {
		this.sessionEva = sessionEva;
	}
	public int getNbs() {
		return nbs;
	}
	public void setNbs(int nbs) {
		this.nbs = nbs;
	}
	public String[] getSalle() {
		return salle;
	}
	public void setSalle(String[] salle) {
		this.salle = salle;
	}
	public String[] getUv() {
		return uv;
	}
	public void setUv(String[] uv) {
		this.uv = uv;
	}
	public int getNbf() {
		return nbf;
	}
	public void setNbf(int nbf) {
		this.nbf = nbf;
	}
	public String getFaceva() {
		return faceva;
	}
	public void setFaceva(String faceva) {
		this.faceva = faceva;
	}

}
