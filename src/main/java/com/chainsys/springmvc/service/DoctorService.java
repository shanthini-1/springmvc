package com.chainsys.springmvc.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
// used to commit,rollback

import com.chainsys.springmvc.pojo.Appointments;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.repository.AppointmentRepository;
import com.chainsys.springmvc.repository.DoctorRepository;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository repo;
	@Autowired
	private AppointmentRepository aptReop;

	public List<Doctor> getDoctors() {
		List<Doctor> doclist = repo.findAll();
		return doclist;

	}
//	@Transactional
	public Doctor addDoctor(Doctor doc) {
		return repo.save(doc);
	}
	@Transactional
	public void deleteDoctor(int id) {
		repo.deleteById(id);
	}

	public Doctor getDoctorbyid(int id) {
		return repo.findById(id);
	}
	public DoctorAppointmentsDTO getAppointmentsDTO(int id) {
		Doctor doc = getDoctorbyid(id);
		DoctorAppointmentsDTO dto = new DoctorAppointmentsDTO();
		dto.setDoctor(doc);
		for(int i=0;i<5;i++){
			Appointments apo = new Appointments();
			apo.setAppointment_id(i);
			Date dt= new Date(22,7,25);
			apo.setAppointment_date(dt);
			apo.setDr_id(id);
			apo.setPatient_name("shan");
			apo.setPhone_no(6789045678L);
			apo.setFee_collected(i*500);
			dto.addAppointment(apo);
		}
		return dto;
		
	}

public void addDoctorAndAppointments(DoctorAppointmentsDTO dto) {
	Doctor doc = dto.getDoctor();
	addDoctor(doc);
	List<Appointments> appointmentList = dto.getAppointments();
	int count = appointmentList.size();
	for(int i= 0;i<count;i++) {
		aptReop.save(appointmentList.get(i));
	}
}

public int getNextAppointments() {
	return aptReop.getNextId();
}


}