package com.mycom.service;

import com.mycom.bean.User;

public interface IUserService {
	/**
	 * 通过用户id查找用户
	 * @param id 用户id
	 * @return
	 */
	public User getUserById(int id);
	
	public boolean addUser(User user);
}