package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class FirstSpringBootProject {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FirstSpringBootProject.class);
		
		
		UserSetter userBySett = (UserSetter) context.getBean("userSetter");

		userBySett.iphone.actionOnPress();

		UserConstructor userByConst = (UserConstructor) context.getBean("userConstructor");

		userByConst.iphone.actionOnHold();

		UserAutoWire userByAuto = (UserAutoWire) context.getBean("userAutoWire");

		userByAuto.iphone.actionOnTouch();
	}
}