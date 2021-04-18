package com.spring.mypack;

import org.springframework.stereotype.Component;

@Component
public class AcessDataBase {

	public String getStudent() {
		throw new RuntimeException("Nooooooooo ...");
		//return "Name of Student is Eslam";
	}
}
