package com.backend.dao;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.model.Users;

@Repository("UserDaoImpl")
@Transactional
public class UserDaoImpl  implements UsersDao {

 
@Autowired
private SessionFactory sessionFactory;
public void registerUser(Users user){

	Session session=sessionFactory.getCurrentSession();
	session.save(user);
	
}
	
}
