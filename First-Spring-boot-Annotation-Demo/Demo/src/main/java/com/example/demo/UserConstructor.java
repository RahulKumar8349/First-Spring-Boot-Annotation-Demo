package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserConstructor {
	 IPhone iphone;
	 	
	    public UserConstructor(@Qualifier("iphone13") IPhone iphone) {
	        this.iphone = iphone;
	        System.out.println("Constructor Injection");
	    }
}
