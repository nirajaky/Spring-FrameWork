package com.nirajaky;

import com.nirajaky.wire.Emp;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Emp emp = (Emp) context.getBean("emp");
        System.out.println(emp);

        System.out.println( "Hello World!" );
    }
}
