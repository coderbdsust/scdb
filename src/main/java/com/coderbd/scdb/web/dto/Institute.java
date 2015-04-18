package com.coderbd.scdb.web.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "institutes")
public class Institute implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "institute_id")
	private int instituteId;

	@Column(name = "institute_name")
	private String instituteName;

	public Institute() {
	}

	public Institute(String instituteName) {
		this.instituteName = instituteName;
	}

	public Institute(int instituteId, String instituteName) {

		this.instituteId = instituteId;
		this.instituteName = instituteName;
	}

	public int getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName="
				+ instituteName + "]";
	}

}
