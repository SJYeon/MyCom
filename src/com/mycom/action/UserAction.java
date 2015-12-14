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
		//������������Ϣ
		User inviter = userser.getUserById(inviterid);
		//�ж��Ƿ���������
		if(inviter != null){
			//�������˲����û���Ϣ��
			user.setUser(inviter);
		}
		String pwd = user.getPassword();
		//����û�
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
		//��¼�û�
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
