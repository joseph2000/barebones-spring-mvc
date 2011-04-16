package com.earldouglas.example.springmvc.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

	@ModelAttribute("values")
	public List<String> getSimpleValues() {
		List<String> simpleValues = new ArrayList<String>();
		simpleValues.add("Value A");
		simpleValues.add("Value B");
		simpleValues.add("Value C");
		return simpleValues;
	}

	@RequestMapping(value = "/simpleForm", method = RequestMethod.GET)
	public void simpleForm(Model model) {
		model.addAttribute(new SimpleForm());
	}

	@RequestMapping(value = "/simple", method = RequestMethod.GET)
	public String simple() {
		return "redirect:simpleForm";
	}

	@RequestMapping(value = "/simple", method = RequestMethod.POST)
	public void simple(@ModelAttribute SimpleForm simpleForm, Model model) {
		model.addAttribute("value1", simpleForm.getValue1());
		model.addAttribute("value2", simpleForm.getValue2());
		model.addAttribute("value3", simpleForm.getValue3());
		model.addAttribute(simpleForm);
	}
}