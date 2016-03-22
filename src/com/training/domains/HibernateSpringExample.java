package com.training.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.training.entity.Student;
import com.training.iface.MyDAO;


public class HibernateSpringExample extends HibernateDaoSupport implements MyDAO<Student> {

	@Override
	public Serializable add(Student t) {
	
		Serializable key = getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public Student find(Serializable obj) {
		Student doc = getHibernateTemplate().get(Student.class, obj);
		return doc;
	}

	@Override
	public List<Student> findAll() {
		@SuppressWarnings("unchecked")
		List<Student> docList = (List<Student>)getHibernateTemplate().find("from Doctor");
		return docList;
	}

	@Override
	public boolean update(Student obj) {
		boolean flag = true;
		try {
			getHibernateTemplate().update(obj);
		} catch (Exception e) {
			flag=false;
		}getHibernateTemplate().update(obj);
		return flag; 
	}

	@Override
	public boolean delete(Serializable obj) {
		boolean flag = true;
		try {
			getHibernateTemplate().delete(obj);
		} catch (Exception e) {
			flag=false;
		}getHibernateTemplate().delete(obj);
		return flag; 
	}

	
	

}
