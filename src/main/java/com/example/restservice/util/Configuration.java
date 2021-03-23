package com.example.restservice.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;


@Component
public class Configuration {

	private SessionFactory hibernateFactory;
	
	
	  @Autowired
	  public Configuration(EntityManagerFactory factory) {
	    if(factory.unwrap(SessionFactory.class) == null){
	      throw new NullPointerException("this factory is not a hibernate factory");
	    }
	    this.hibernateFactory = factory.unwrap(SessionFactory.class);
	  }


	public SessionFactory getHibernateFactory() {
		return hibernateFactory;
	}


	public void setHibernateFactory(SessionFactory hibernateFactory) {
		this.hibernateFactory = hibernateFactory;
	}
	
	
}
