package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class IPhone15 implements IPhone{
	@Override
    public void actionOnPress() {
        System.out.println("Flash On..");
    }

    @Override
    public void actionOnHold() {
        System.out.println("Opening Camera..");
    }

    @Override
    public void actionOnTouch() {
        System.out.println("Unlock on Touch");
    }
}
