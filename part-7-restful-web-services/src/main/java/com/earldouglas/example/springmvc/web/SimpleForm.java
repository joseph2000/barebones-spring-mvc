package com.earldouglas.example.springmvc.web;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@XmlRootElement
public class SimpleForm {

	@XmlElement
	private String value1;

	@XmlElement
	private String value2;

	@XmlElement
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