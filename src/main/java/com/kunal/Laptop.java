package com.kunal;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {


    @Override
    public void Compile(){
        System.out.println(" Compiling !!");
    }
}
