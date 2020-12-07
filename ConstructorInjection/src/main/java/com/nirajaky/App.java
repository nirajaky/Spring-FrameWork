package com.nirajaky;

import com.nirajaky.constInj.Person;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationProperties.xml");

        Person p = (Person) context.getBean("const");
        System.out.println(p);
        System.out.println( "Hello World!" );
    }
}
