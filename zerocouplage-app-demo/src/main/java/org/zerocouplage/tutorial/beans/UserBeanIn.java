package org.zerocouplage.tutorial.beans;

import java.io.File;

public class UserBeanIn {
	private String nomUtilisateur;
	private String motDepasse;
	private String datN;
	private String mail;
	private File CvFile;


	public String getDatN() {
		return datN;
	}

	public void setDatN(String dateNaissance) {
		this.datN = dateNaissance;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String email) {
		this.mail = email;
	}

	
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMotDepasse() {
		return motDepasse;
	}

	public void setMotDepasse(String motDepasse) {
		this.motDepasse = motDepasse;
	}

	public File getCvFile() {
		return CvFile;
	}

	public void setCvFile(File cvFile) {
		CvFile = cvFile;
	}

}
