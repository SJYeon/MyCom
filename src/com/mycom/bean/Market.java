package com.mycom.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Market entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "market", catalog = "mycom")
public class Market implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String marketname;
	private String work;
	private String phone;
	private String qq;
	private String introduction;
	private String school;
	private Date registertime;
	private Boolean del;
	
	// Constructors

	/** default constructor */
	public Market() {
	}

	/** full constructor */
	public Market(User user, String marketname, String work, String phone,
			String qq, String introduction, String school, Date registertime
			) {
		this.user = user;
		this.marketname = marketname;
		this.work = work;
		this.phone = phone;
		this.qq = qq;
		this.introduction = introduction;
		this.school = school;
		this.registertime = registertime;
		this.del = del;
		
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
	@JoinColumn(name = "ownerid")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "marketname", length = 20)
	public String getMarketname() {
		return this.marketname;
	}

	public void setMarketname(String marketname) {
		this.marketname = marketname;
	}

	@Column(name = "work", length = 5)
	public String getWork() {
		return this.work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Column(name = "phone", length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "qq", length = 12)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "introduction")
	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Column(name = "school", length = 20)
	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "registertime", length = 0)
	public Date getRegistertime() {
		return this.registertime;
	}

	public void setRegistertime(Date registertime) {
		this.registertime = registertime;
	}

	@Column(name = "del")
	public Boolean getDel() {
		return this.del;
	}

	public void setDel(Boolean del) {
		this.del = del;
	}

}