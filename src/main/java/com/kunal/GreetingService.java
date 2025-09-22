package com.kunal;

import org.springframework.stereotype.Component;

public class GreetingService {


    public  String Greet(String name)
    {
        return "Hello "+ name+"!";
    }
}
