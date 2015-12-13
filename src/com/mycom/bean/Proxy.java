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
 * Proxy entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "proxy", catalog = "mycom")
public class Proxy implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String type;
	private String school;
	private String building;
	private Date registertime;
	private Boolean del;
	
	// Constructors

	/** default constructor */
	public Proxy() {
	}

	/** full constructor */
	public Proxy(User user, String type, String school, String building,
			Date registertime, Boolean del, Set<Proxyshpcart> proxyshpcarts
			) {
		this.user = user;
		this.type = type;
		this.school = school;
		this.building = building;
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
	@JoinColumn(name = "userid")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "type", length = 10)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "school", length = 20)
	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Column(name = "building", length = 20)
	public String getBuilding() {
		return this.building;
	}

	public void setBuilding(String building) {
		this.building = building;
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