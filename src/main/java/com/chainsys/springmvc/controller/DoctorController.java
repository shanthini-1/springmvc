package com.chainsys.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.springmvc.pojo.Appointments;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService docService;

	@GetMapping("/getalldoctors")
	public String getDoctors(Model model) {
		List<Doctor> doclist = docService.getDoctors();
		model.addAttribute("alldoctors", doclist);
		return "list-doctors";
	}

	@GetMapping("/getdoctor")
	public String getDoctor(@RequestParam("id") int id, Model model) {
		Doctor theDoc = docService.getDoctorbyid(id);
		model.addAttribute("finddoctorbyid", theDoc);
		return "finddoctorbyid-doctor-form";
	}

	@GetMapping("/adddoctorform")
	public String showAddForm(Model model) {
		Doctor theDoc = new Doctor();
		model.addAttribute("adddoctor", theDoc);
		return "add-doctor-form";
	}

	@PostMapping("/adddoctors")
	public String addNewDoctors(@ModelAttribute("adddoctor") Doctor theDoc) {
		docService.addDoctor(theDoc);
		return "redirect:/doctor/getalldoctors";
	}

	@GetMapping("/updatedoctorform")
	public String showUpdateForm(@RequestParam("id") int id, Model model) {
		Doctor theDoc = docService.getDoctorbyid(id);
		model.addAttribute("updatedoctor", theDoc);
		return "update-doctor-form";
	}

	@PostMapping("/modifydoctor")
	public String modifyDoctor(@ModelAttribute("updatedoctor") Doctor theDoc) {
		docService.addDoctor(theDoc);
		return "redirect:/doctor/getalldoctors";
	}

	@GetMapping("/deletedoctor")
	public String deleteDoctor(@RequestParam("id") int id) {
		docService.deleteDoctor(id);
		return "redirect:/doctor/getalldoctors";
	}
	@GetMapping("/doctorappointments")
	public String getappointments(@RequestParam("id") int id, Model model) {
		DoctorAppointmentsDTO dto =docService.getAppointmentsDTO(id);
		model.addAttribute("doctorappointments", dto.getDoctor());
		model.addAttribute("applist", dto.getAppointments());
		return "list-doctors";
	}
	@GetMapping("/trans")
	public void testTransaction(@RequestParam("id") int id) {
		DoctorAppointmentsDTO dto = new DoctorAppointmentsDTO();
		Doctor doc = new Doctor();
		doc.setDOC_ID(id);
		doc.setDOC_NAME("Bheem");
		Date docdt = new Date(23,8,1989);
		doc.setDOC_DOB(docdt);
		doc.setDOC_EMIAL("bheeemqwerty@gmail.com");
		doc.setSPECIALITY("ENT");
		doc.setPHONE_NO(6789045609L);
		doc.setCITY("Dollukpur");
		doc.setFEE(600);
		List<Appointments> applist = new ArrayList<Appointments>();
//		int nextAppId = docService.getNextAppointments();
//		for(int i=nextAppId;i<nextAppId;i++){
		for(int i=100;i<103;i++){
			Appointments apo = new Appointments();
			apo.setAppointment_id(i);
			Date appdt= new Date(22,7,25);
			apo.setAppointment_date(appdt);
			apo.setDr_id(id);
			apo.setPatient_name("shan");
			apo.setPhone_no(6789045678L);
			apo.setFee_collected(i*500);
			dto.addAppointment(apo);
		}
	docService.addDoctorAndAppointments(dto);
	System.out.println("sucessfully completed");
	}
}
