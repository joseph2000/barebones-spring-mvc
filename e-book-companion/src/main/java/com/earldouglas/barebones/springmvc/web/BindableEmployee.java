package com.earldouglas.barebones.springmvc.web;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.earldouglas.barebones.springmvc.Employee;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@XmlRootElement
public class BindableEmployee {

	@XmlElement
	private Long id;

	@XmlElement
	@Pattern(regexp = "\\w+ \\w+")
	private String name;

	@XmlElement
	@Pattern(regexp = "\\w+( \\w+)?")
	private String title;

	public BindableEmployee() {
	}

	public BindableEmployee(Employee employee) {
		this.id = employee.getId();
		this.name = employee.getName();
		this.title = employee.getTitle();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static Collection<BindableEmployee> bindableEmployees(
			Collection<Employee> employees) {
		Collection<BindableEmployee> bindableEmployees = new ArrayList<BindableEmployee>();
		for (Employee employee : employees) {
			bindableEmployees.add(new BindableEmployee(employee));
		}
		return bindableEmployees;
	}

	public Employee asEmployee() {
		return new Employee(id, name, title);
	}

}
