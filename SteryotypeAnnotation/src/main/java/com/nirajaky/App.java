package com.nirajaky;

import com.nirajaky.steryotype.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Instantiating a Spring IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student);
        System.out.println(student.getList());
        System.out.println(student.getList().getClass().getName());

        System.out.println( "Hello World!" );
    }
}
