package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserSetter {
	
	 IPhone iphone;

	    @Autowired
	    public void setIphone(@Qualifier("iphone10")IPhone iphone) {
	        this.iphone = iphone;
	        System.out.println("Setter Injection");
	    }

}
