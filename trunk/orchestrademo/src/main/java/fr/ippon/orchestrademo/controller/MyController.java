package fr.ippon.orchestrademo.controller;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.ippon.orchestrademo.dao.User;
import fr.ippon.orchestrademo.dao.UserServiceImpl;

/**
 * My controller to determinate where to go
 * 
 * @author sfoubert
 * 
 */
public class MyController implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Log log = LogFactory.getLog(MyController.class);
	


	public MyController() {

	}

	public String showList(){
		log.info("enter MyController.showList");
		
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		List<User> usersList = userServiceImpl.queryAllUsers();
		System.out.println(usersList.size());
		
		return "showList";
	}
	
	public String addUser(){
		log.info("enter MyController.addUser");
		return "addUser";
	}
	
}
