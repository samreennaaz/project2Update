package com.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.AppConfig;

import com.backend.dao.UsersDao;

import com.backend.model.Users;


public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new  AnnotationConfigApplicationContext(AppConfig.class);
        //annotationConfigApplicationContext.refresh();
        UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("UserDaoImpl");
        Users user=new Users();
        user.setUsername("SAM");
        user.setEmailId("xyz@yahoo.com");
        user.setPassword("ABCD");
        user.setAddress("Hyderabad");
        userDao.registerUser(user);
                  
        
        
        
    	
		 
  
    }
}
