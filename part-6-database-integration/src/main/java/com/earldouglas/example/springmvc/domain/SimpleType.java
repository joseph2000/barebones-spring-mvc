package com.earldouglas.example.springmvc.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionOfElements;

@Entity
public class SimpleType {

	@Id
	@Column
	private long id;

	@Column
	private String value1;

	@Column
	private String value2;

	@CollectionOfElements
	@Column
	private List<String> value3;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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