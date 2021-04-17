package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configration.SpringContainer;
import com.spring.dao.PostDao;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext an = 
				new AnnotationConfigApplicationContext(SpringContainer.class);
		PostDao po = an.getBean("postDaoImpl",PostDao.class);
		po.allPosts();
		po.allPosts();

	}

}
