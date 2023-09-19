package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("iphone13")
public class IPhone13 implements IPhone {
	@Override
    public void actionOnPress() {
        System.out.println("Back To Silent");
    }

    @Override
    public void actionOnHold() {
        System.out.println("Music Player On");
    }

    @Override
    public void actionOnTouch() {
        System.out.println("Can't Perform Any Operation..");
    }
}
