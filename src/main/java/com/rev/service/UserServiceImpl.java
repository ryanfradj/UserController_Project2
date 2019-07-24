package com.rev.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rev.dao.UserDAO;
import com.rev.entity.User;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO ud;
	
	@Override
	@Transactional
	public List<User> getAllUsers() {
		List<User> userList= ud.viewAllUsers();
		return userList;
	}

	@Override
	@Transactional
	public User createUser(User user) {
		if(ud.getUserByUsername(user.getUserName())!=null)
		{
			return ud.updateUser(user);
			
		}
		return ud.addUser(user);
	}

	@Override
	@Transactional
	public User Authenticate(User user) {
		System.out.println(user.getUserName());
		User temp= ud.getUserByUsername(user.getUserName());
		System.out.println(temp.getPassword()+"  "+user.getPassword());
		if(user.getPassword().equals(temp.getPassword())) {
			return temp;
		}
		else {
			return null;
		}
	}

	@Override
	@Transactional
	public User getUserById(long id) {
		return ud.getUserById(id);
	}

	@Override
	@Transactional
	public void deleteUser(long id) {
		ud.deleteUserById(id);
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		return ud.updateUser(user);
	}
	

}
