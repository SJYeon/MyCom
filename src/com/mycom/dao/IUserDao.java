package com.mycom.dao;

import com.mycom.bean.User;

public interface IUserDao {
	/**
	 * 通过id查询用户
	 * @param id 用户id
	 * @return
	 */
	public User getUserById(int id);
	/**
	 * 添加用户
	 * @param user 用户信息
	 * @return
	 */
	public boolean addUser(User user);
	/**
	 * 通过用户电话号码查找用户
	 * @return
	 */
	public User getUserByPhone(String phone);
}