package com.earldouglas.example.springmvc.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.earldouglas.example.springmvc.domain.Repository;
import com.earldouglas.example.springmvc.domain.SimpleType;

@Controller
public class SimpleController {

	@Autowired
	private Repository repository;

	@ModelAttribute("values")
	public List<String> getSimpleValues() {
		List<String> simpleValues = new ArrayList<String>();
		simpleValues.add("Value A");
		simpleValues.add("Value B");
		simpleValues.add("Value C");
		return simpleValues;
	}

	@Transactional
	@RequestMapping(value = "/simpleForm", method = RequestMethod.GET)
	public void simpleForm(Model model) {
		SimpleType simpleType = repository.getSimpleType(0);
		SimpleForm simpleForm = simpleForm(simpleType);
		model.addAttribute(simpleForm);
	}

	@RequestMapping(value = "/simple", method = RequestMethod.GET)
	public String simple() {
		return "redirect:simpleForm";
	}

	@Transactional
	@RequestMapping(value = "/simple", method = RequestMethod.POST)
	public void simple(@ModelAttribute SimpleForm simpleForm, Model model) {
		SimpleType simpleType = simpleType(simpleForm);
		simpleForm = simpleForm(simpleType);

		model.addAttribute("value1", simpleForm.getValue1());
		model.addAttribute("value2", simpleForm.getValue2());
		model.addAttribute("value3", simpleForm.getValue3());
		model.addAttribute(simpleForm);
	}

	private SimpleForm simpleForm(SimpleType simpleType) {
		if (simpleType != null) {
			SimpleForm simpleForm = new SimpleForm();
			simpleForm.setValue1(simpleType.getValue1());
			simpleForm.setValue2(simpleType.getValue2());
			simpleForm.setValue3(simpleType.getValue3());

			if (simpleType.getValue3() != null) {
				simpleType.getValue3().size();
			}

			return simpleForm;
		} else {
			return new SimpleForm();
		}
	}

	private SimpleType simpleType(SimpleForm simpleForm) {
		SimpleType simpleType = repository.getSimpleType(1);
		if (simpleType == null) {
			simpleType = new SimpleType();
			repository.save(simpleType);
		}
		simpleType.setValue1(simpleForm.getValue1());
		simpleType.setValue2(simpleForm.getValue2());
		simpleType.setValue3(simpleForm.getValue3());

		return simpleType;
	}
}