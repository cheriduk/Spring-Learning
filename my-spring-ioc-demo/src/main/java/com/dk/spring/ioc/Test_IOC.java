package com.dk.spring.ioc;

import com.dk.spring.ioc.iocfactory.ApplicationContext;
import com.dk.spring.ioc.iocfactory.impl.ClassPathXMLApplicationContext;
import com.dk.spring.ioc.service.StudentService;

public class Test_IOC {
	
	public static void main(String[] args) {  
           ApplicationContext context = new ClassPathXMLApplicationContext("applicationContext.xml");  
           StudentService  stuServ = (StudentService) context.getBean("StudentService");  
           stuServ.getStudent().selfIntroDuction();  
   }  

}
