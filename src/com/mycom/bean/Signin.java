package com.mycom.bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Signin entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "signin", catalog = "mycom")
public class Signin implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private Date signintime;

	// Constructors

	/** default constructor */
	public Signin() {
	}

	/** full constructor */
	public Signin(User user, Date signintime) {
		this.user = user;
		this.signintime = signintime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "signintime", length = 0)
	public Date getSignintime() {
		return this.signintime;
	}

	public void setSignintime(Date signintime) {
		this.signintime = signintime;
	}

}