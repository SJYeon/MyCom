package com.mycom.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;

import com.mycom.bean.User;
import com.mycom.service.IUserService;

public class UserAction {
	private User user;
	
	private int inviterid;
	
	@Resource(name="userser")
	private IUserService userser;
	
	public String register(){
		//查找邀请人信息
		User inviter = userser.getUserById(inviterid);
		//判断是否有邀请人
		if(inviter != null){
			//将邀请人插入用户信息中
			user.setUser(inviter);
		}
		String pwd = user.getPassword();
		//添加用户
		boolean result = userser.addUser(user);
		if(result){
			user.setPassword(pwd);
			int userid = userser.login(user);
			if(userid != -1){
				ServletActionContext.getRequest().getSession().setAttribute("userid", userid);
				return "success";
			}
		}
		return "error";
	}
	
	public String login(){
		//登录用户
		int userid = userser.login(user);
		if(userid != -1){
			ServletActionContext.getRequest().getSession().setAttribute("userid", userid);
			return "success";
		}
		return "error";
		
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
