package com.mycom.service;

import com.mycom.bean.User;

public interface IUserService {
	/**
	 * ͨ���û�id�����û�
	 * @param id �û�id
	 * @return
	 */
	public User getUserById(int id);
	
	public boolean addUser(User user);
}