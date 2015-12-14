package com.mycom.service;

import com.mycom.bean.User;

public interface IUserService {
	/**
	 * 通过用户id查找用户
	 * @param id 用户id
	 * @return
	 */
	public User getUserById(int id);
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public boolean addUser(User user);
	/**
	 * 用户登录 
	 * @param phone 用户手机号
	 * @return
	 */
	public int login(User user);
}