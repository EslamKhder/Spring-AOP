package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configration.SpringContainer;
import com.spring.mypack.Person;

public class MainAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext an = 
				new AnnotationConfigApplicationContext(SpringContainer.class);
		Person p = an.getBean("myPerson",Person.class);
		p.getData();
	}

}
