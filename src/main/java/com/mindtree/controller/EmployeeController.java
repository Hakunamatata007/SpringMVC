package com.mindtree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.EmployeeEntity;
import com.mindtree.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@ResponseBody
	@RequestMapping(value = "/add")
	public String addEmployee(EmployeeEntity employee) {
//		System.out.println("I am trying to add employee");
//		@RequestParam(value = "firstName") String firstName,
//		@RequestParam(value = "lastName") String lastName, @RequestParam(value = "email") String email,
//		@RequestParam(value = "telephone") String telephone
//		EmployeeEntity employee = new EmployeeEntity();
//		employee.setEmail(email);
//		employee.setFirstname(firstName);
//		employee.setLastname(lastName);
//		employee.setTelephone(telephone);
		employeeService.addEmployee(employee);
		return "Added Successful";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listEmployee(ModelAndView mav) {
		mav.setViewName("show");
		mav.addObject("listEmployee", employeeService.getAllEmployees());
		return mav;
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String deleteEmployee(@RequestParam("employeeId") String employeeId) {
		employeeService.deleteEmployee(Integer.parseInt(employeeId));
		return "Deleted Successfully";
	}
}
