package com.spring.mypack;

import org.springframework.stereotype.Component;

@Component
public class AcessDataBase {

	public void getStudent() {
		System.out.println("Studnt ....");
		throw new RuntimeException("Exception ..... !");
	}
}
