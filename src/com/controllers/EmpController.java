package com.controllers;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.beans.Employee;
import com.dao.EmpDao;

@Controller
public class EmpController {
	@Autowired
	EmpDao dao;

	@RequestMapping("/viewemp")
	public ModelAndView viewemp() {
		List<Employee> list = dao.getEmployees();
		return new ModelAndView("viewemp", "list", list);
	}

	@RequestMapping(value = "/addEmp")
	public ModelAndView empAddForm(@ModelAttribute("emp") Employee emp) {
		dao.insertEmployee(emp);
		ModelAndView model = new ModelAndView("EmployeeAddSuccess");
		return model;
	}

	@RequestMapping(value = "/findEmp")
	public ModelAndView empFindForm(@RequestParam("acc_no") int acc_no) {
		System.out.println("Acc No " + acc_no);
		Employee e = dao.selectEmployee(acc_no);
		ModelAndView model = null;
		if (e != null) {
			model = new ModelAndView("FindEmployee");
			model.addObject("e", e);
		} else {
			model = new ModelAndView("index");
			model.addObject("e", e);
		}
		return model;
	}
	@RequestMapping(value="/updateEmployee")
	public ModelAndView empUpdateForm(@RequestParam("amount") int amount,@RequestParam("acc_no") int acc_no)
	{
		//System.out.println("Enters");
		dao.updateEmployee(amount,acc_no);
		//System.out.println("2");
		ModelAndView model = new ModelAndView("updateEmployee");
		model.addObject("amount",amount);
		model.addObject("acc_no",acc_no);
		
		System.out.println("3");
		return model;
	}
}
