package com.mycom.action;

import javax.annotation.Resource;

import com.mycom.bean.User;
import com.mycom.service.IUserService;

public class UserAction {
	private User user;
	
	private int inviterid;
	
	@Resource(name="userser")
	private IUserService userser;
	
	public String register(){
		User inviter = userser.getUserById(inviterid);
		if(inviter != null){
			user.setUser(inviter);
		}
		boolean result = userser.addUser(user);
		return result?"success":"error";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getInviterid() {
		return inviterid;
	}

	public void setInviterid(int inviterid) {
		this.inviterid = inviterid;
	}

	public IUserService getUserser() {
		return userser;
	}

	public void setUserser(IUserService userser) {
		this.userser = userser;
	}
	
}
