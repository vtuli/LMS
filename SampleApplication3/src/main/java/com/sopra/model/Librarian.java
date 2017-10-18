package com.sopra.model;

import javax.persistence.Entity;

@Entity
public class Librarian {

	private int librarianId;
	private String librarianPassword;

	public int getLibrarianId() {
		return librarianId;
	}

	public void setLibrarianId(int librarianId) {
		this.librarianId = librarianId;
	}

	public String getLibrarianPassword() {
		return librarianPassword;
	}

	public void setLibrarianPassword(String librarianPassword) {
		this.librarianPassword = librarianPassword;
	}
}
