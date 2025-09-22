package com.kunal;

import org.springframework.stereotype.Component;

@Component
public class Programmer {

    private int lineofcode;


    public Programmer(int lineofcode) {
        this.lineofcode = lineofcode;

    }
   public Programmer(){
        this.lineofcode=0;
   }




    public int setlineofcode(int num)
    {
        return  lineofcode = num;
    }

    public int getlineofcode()
    {
        return lineofcode;

    }

    public void Code()
    {
        System.out.println("Coding !!");
    }
}
