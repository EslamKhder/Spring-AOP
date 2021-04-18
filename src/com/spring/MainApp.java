package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configration.SpringContainer;
import com.spring.dao.PostDao;
import com.spring.dao.PostService;
import com.spring.model.User;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext an = 
				new AnnotationConfigApplicationContext(SpringContainer.class);
		PostDao po = an.getBean("postDaoImpl",PostDao.class);
		User u = new User();
		int re = 0;
		po.allPosts(u);
		System.out.println(po.allLikes(u,re));
		po.fumDao();
		
		System.out.println("***********************");
		po.setId();
		po.getId();
		System.out.println("***********************");
		
		System.out.println("////////////////////////////");
		
		PostService ps = an.getBean("postServiceImpl",PostService.class);
		System.out.println(ps.allPosts(u,re));
		System.out.println(ps.allLikes(u));
		ps.startService();
		System.out.println("***********************");
		ps.setName();
		ps.getName();
		System.out.println("***********************");

	}

}
