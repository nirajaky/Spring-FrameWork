package com.nirajaky;

import com.nirajaky.lifecycle.Pepsi;
import com.nirajaky.lifecycle.Samosa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();   // THIS WILL CALL destroy Method. Note: regi... _ This method is present in AbstractApplicationContext interface

        Samosa s1 = (Samosa) context.getBean("samosa");
        System.out.println(s1);

        System.out.println("******************************");

        Pepsi p1 =(Pepsi) context.getBean("pepsi");
        System.out.println(p1);
    }
}
