package com.earldouglas.barebones.springmvc.web;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.earldouglas.barebones.springmvc.Employee;
import com.earldouglas.barebones.springmvc.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<BindableEmployee> get() {
		return BindableEmployee.bindableEmployees(employeeService.get());
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String get(Model model) {
		return get(null, model);
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
	public String get(@PathVariable Long employeeId, Model model) {
		Employee employee = employeeService.get(employeeId);
		if (employee != null) {
			model.addAttribute(new BindableEmployee(employee));
		} else {
			model.addAttribute(new BindableEmployee());
		}
		return "employee";
	}

	@RequestMapping(value = "/{employeeId}/delete", method = RequestMethod.GET)
	public String deleteViaGet(@PathVariable Long employeeId) {
		return delete(employeeId);
	}

	@RequestMapping(value = "/{employeeId}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Long employeeId) {
		employeeService.delete(employeeId);
		return "redirect:../../employees";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String save(@Valid BindableEmployee bindableEmployee,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "employee";
		}

		employeeService.save(bindableEmployee.asEmployee());
		return "redirect:employees";
	}
}