package com.chainsys.springmvc.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor {
	@Id
	private int DOC_ID;
	private String DOC_NAME;
	private Date DOC_DOB;
	private String DOC_EMIAL;
	private String SPECIALITY;
	private String CITY;
	private long PHONE_NO;
	@Column(name = "STANDARD_FEE") 
	private float FEE;

	public int getDOC_ID() {
		return DOC_ID;
	}

	public void setDOC_ID(int dOC_ID) {
		DOC_ID = dOC_ID;
	}

	public String getDOC_NAME() {
		return DOC_NAME;
	}

	public void setDOC_NAME(String dOC_NAME) {
		DOC_NAME = dOC_NAME;
	}

	public Date getDOC_DOB() {
		return DOC_DOB;
	}

	public void setDOC_DOB(Date dOC_DOB) {
		DOC_DOB = dOC_DOB;
	}

	public String getDOC_EMIAL() {
		return DOC_EMIAL;
	}

	public void setDOC_EMIAL(String dOC_EMIAL) {
		DOC_EMIAL = dOC_EMIAL;
	}

	public String getSPECIALITY() {
		return SPECIALITY;
	}

	public void setSPECIALITY(String sPECIALITY) {
		SPECIALITY = sPECIALITY;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public long getPHONE_NO() {
		return PHONE_NO;
	}

	public void setPHONE_NO(long pHONE_NO) {
		PHONE_NO = pHONE_NO;
	}

	public float getFEE() {
		return FEE;
	}

	public void setFEE(float sTANDARD_FEE) {
		FEE = sTANDARD_FEE;
	}

	@Override
	public String toString() {
		return String.format("%d, %s, %s, %s, %s, %s, %d, %2f", DOC_ID, DOC_NAME, DOC_DOB, DOC_EMIAL, SPECIALITY, CITY,
				PHONE_NO, FEE);
	}
}
