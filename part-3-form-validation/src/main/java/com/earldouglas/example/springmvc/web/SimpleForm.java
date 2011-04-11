package com.earldouglas.example.springmvc.web;

import java.util.List;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SimpleForm {

	@Size(min = 2, max = 6)
	private String value1;

	@Pattern(regexp = "Val.*C")
	private String value2;

	private List<String> value3;

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public List<String> getValue3() {
		return value3;
	}

	public void setValue3(List<String> value3) {
		this.value3 = value3;
	}
}