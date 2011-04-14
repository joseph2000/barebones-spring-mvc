package com.earldouglas.example.springmvc.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

public class Repository {

	@Autowired
	private SessionFactory sessionFactory;

	private Session session() {
		return sessionFactory.getCurrentSession();
	}

	public SimpleType getSimpleType(long id) {
		return (SimpleType) session().createCriteria(SimpleType.class).add(
				Restrictions.idEq(id)).uniqueResult();
	}

	public void save(SimpleType simpleType) {
		session().saveOrUpdate(simpleType);
	}
}
