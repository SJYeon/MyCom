package com.mycom.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mycom.bean.User;
import com.mycom.dao.IUserDao;

public class UserDaoImpl extends HibernateDaoSupport implements IUserDao {

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		
		Object[] args = {id};
		List<User> list = this.getHibernateTemplate().find("from com.mycom.bean.User where id=?", args);
		if(list.size()>0){
			return list.get(0);
		}
		
		return null;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		try{
			this.getHibernateTemplate().save(user);
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

}
