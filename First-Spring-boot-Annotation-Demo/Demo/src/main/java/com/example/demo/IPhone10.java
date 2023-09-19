package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("iphone10")
public class IPhone10 implements IPhone {
	@Override
    public void actionOnPress() {
        System.out.println("Silent Mode On");
    }

    @Override
    public void actionOnHold() {
        System.out.println("Can't Hold in IPhone 10");
    }

    @Override
    public void actionOnTouch() {
        System.out.println("Feature Not Available");
    }
}
