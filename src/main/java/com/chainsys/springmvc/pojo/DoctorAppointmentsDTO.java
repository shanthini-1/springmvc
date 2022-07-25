package com.chainsys.springmvc.pojo;

import java.util.ArrayList;
import java.util.List;

public class DoctorAppointmentsDTO {
	private Doctor doctor;
	private List<Appointments> applist = new ArrayList<Appointments>();
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public void addAppointment(Appointments apt) {
		applist.add(apt);
	}
	public List<Appointments> getAppointments(){
		return applist;
	}
	
}
/*
 * Dto container - it contains multi table connection details
 */

