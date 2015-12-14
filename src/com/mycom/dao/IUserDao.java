package com.mycom.dao;

import com.mycom.bean.User;

public interface IUserDao {
	/**
	 * ͨ��id��ѯ�û�
	 * @param id �û�id
	 * @return
	 */
	public User getUserById(int id);
	/**
	 * ����û�
	 * @param user �û���Ϣ
	 * @return
	 */
	public boolean addUser(User user);
	/**
	 * ͨ���û��绰��������û�
	 * @return
	 */
	public User getUserByPhone(String phone);
}