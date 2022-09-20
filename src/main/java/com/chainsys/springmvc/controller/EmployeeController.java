package com.chainsys.springmvc.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.springmvc.dao.EmployeeDao;
import com.chainsys.springmvc.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/list")
	public String getAllEmployees(Model model) {
		List<Employee> emplist = EmployeeDao.getAllEmployee();
		model.addAttribute("allemployee", emplist);
		return "list-employees";
	}
	@GetMapping("/addform")
	public String showAddForm(Model model) {
		Employee theEmp = new Employee() ;
		model.addAttribute("addemployee", theEmp);
		return "add-employee-form";
	}

	@PostMapping("/add")
	public String addNewEmployees(@ModelAttribute("addemployee") Employee theEmp) {
		EmployeeDao.insertEmployee(theEmp);
		return "redirect:/employee/list";
	}

	@GetMapping("/updateform")
	public String updateEmployees(@RequestParam("empid") int id, Model model) {
		Employee theEmp = EmployeeDao.getEmployeeById(id);
		model.addAttribute("updateemployee", theEmp);
		return "update-employee-form";
	}

	@PostMapping("/updateemp")
	public String updateEmployee(@ModelAttribute("updateemployee") Employee theEmp) {
		EmployeeDao.updateEmployee(theEmp);
		return "redirect:/employee/list";
	}

	@GetMapping("/deleteemployee")
	public String deleteEmployees(@RequestParam("empid") int id) {
		EmployeeDao.deleteEmployee(id);
		return "redirect:/employee/list";
	}

	@GetMapping("/findemployee")
	public String findEmployeeById(@RequestParam("empid") int id, Model model) {
		Employee theEmp = EmployeeDao.getEmployeeById(id);
		model.addAttribute("findemployeebyid", theEmp);
		return "findemployeebyid-employee-form";
	}

}