package com.nirajaky;

import com.nirajaky.lifecycle.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        Example e1 = (Example) context.getBean("example");
        System.out.println(e1);
        //System.out.println( "Hello World!" );
    }
}
