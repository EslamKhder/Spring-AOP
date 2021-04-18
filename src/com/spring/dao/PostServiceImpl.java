package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostServiceImpl implements PostService{

	private String name;
	
	@Override
	public String allPosts(User user,int result) {
		// TODO Auto-generated method stub
		return "My Posts ...... PostService";
	}

	@Override
	public String allLikes(User user) {
		// TODO Auto-generated method stub
		return "PostService... Likes";
	}

	@Override
	public void startService() {
		// TODO Auto-generated method stub
		System.out.println("Start Service");
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		System.out.println("this is set Name");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		System.out.println("this is get Name");
		return null;
	}

}
