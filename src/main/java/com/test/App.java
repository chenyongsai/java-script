package com.test;

import java.util.List;

import javax.annotation.Resource;
import com.cys.ssm.model.User;
import org.springframework.context.*;
import org.springframework.context.support.*;

import com.cys.ssm.dao.IUserDao;

public class App {

	@Resource    
	private static IUserDao userDao; 
	
	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		userDao = (IUserDao) factory.getBean("IUserDao");
		
		User user = new User();
		List<User> uList = userDao.queryList(user);
		for(User obj : uList) {
			System.out.println("app="+obj.getName());
		}
	}
}
