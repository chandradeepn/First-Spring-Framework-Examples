package com.chandradeep.spring.example1;

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
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//      Vehicle veh = (Vehicle) context.getBean("bike");
      Vehicle value =  (Vehicle) context.getBean("car");
//       veh.ride();
       value.ride();
//      Student stud = (Student) context.getBean("students");
//      System.out.println(stud);
    }
}
