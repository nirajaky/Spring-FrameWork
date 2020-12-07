package com.nirajaky;

import com.nirajaky.collections.Employee;
import com.nirajaky.ref.A;
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

        Student student = (Student) context.getBean("student1");

        Student student2 = (Student) context.getBean("student2");
        student2.setStudentId(77);  // this will override property tag under Bean
        student2.setStudentName("Niraj Kumar");

        System.out.println(student);

        System.out.println(student2);

        Employee e1 = (Employee) context.getBean("employee1");
        //e1.setName("Priya Singh");
        System.out.println(e1.getName());
        System.out.println(e1.getAddresses());
        System.out.println(e1.getPhones());
        System.out.println(e1.getCourses()); //Same key is digarded in Map

        System.out.println("REFERENCE TYPE");
        A aa = (A) context.getBean("aref");
        System.out.println(aa.getX());
        System.out.println(aa.getB());
        System.out.println(aa.toString());
        //System.out.println( "Hello World     !" );
    }
}
