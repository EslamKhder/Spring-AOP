package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostDaoImpl implements PostDao{
	
	private int id;

	@Override
	public void allPosts(User user) {
		System.out.println("My Posts ...... PostDao");
	}

	@Override
	public String allLikes(User user,int result) {
		return "PostDao... Likes";
	}

	@Override
	public void fumDao() {
		// TODO Auto-generated method stub
		System.out.println("Fun Dao");
	}

	@Override
	public void setId() {
		System.out.println("this is set ID");
	}

	@Override
	public int getId() {
		System.out.println("this is get ID");
		return 0;
	}
	

}
