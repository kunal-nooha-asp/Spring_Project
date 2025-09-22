package com.kunal;

import com.kunal.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Programmer p1= (Programmer) context.getBean("programmer");
//        Programmer p2 =(Programmer)  context.getBean("programmer");
//        Laptop l1 =  context.getBean("laptop", Laptop.class);
//
////        p1.setlineofcode(20);
//        // By default use singleton object or create one object and pass to other reference
//        // prototype will create new / different object for all
//
//        System.out.println(p1.getlineofcode());
//        p1.Code();
//        System.out.println(p2.getlineofcode());
//        p2.Code();
//        l1.Compile();


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Laptop laptop = context.getBean(Laptop.class);
        laptop.Compile();

    }
}
