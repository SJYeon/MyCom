package com.mycom.service;

import com.mycom.bean.User;

public interface IUserService {
	/**
	 * ͨ���û�id�����û�
	 * @param id �û�id
	 * @return
	 */
	public User getUserById(int id);
	/**
	 * ����û�
	 * @param user
	 * @return
	 */
	public boolean addUser(User user);
	/**
	 * �û���¼ 
	 * @param phone �û��ֻ���
	 * @return
	 */
	public int login(User user);
}