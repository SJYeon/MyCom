package com.mycom.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;

import javax.annotation.Resource;

import com.mycom.bean.User;
import com.mycom.dao.IUserDao;
import com.mycom.service.IUserService;
import com.mycom.basis.MD5;

public class UserServiceImpl implements IUserService {
	@Resource(name="userdao")
	private IUserDao userdao;

	@Override
	public User getUserById(int id) {
		
		User user = userdao.getUserById(id);
		return user;
	}

	@Override
	public boolean addUser(User user) {
		
		user.setDel(false);
		user.setScore(0);
		user.setRegistertime(new Date(System.currentTimeMillis()));
		user.setType("ordinary");
		try {
			user.setPassword(MD5.md5(user.getPassword()));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean result = userdao.addUser(user);

		return result;
	}
	
	public IUserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(IUserDao userdao) {
		this.userdao = userdao;
	}

}
