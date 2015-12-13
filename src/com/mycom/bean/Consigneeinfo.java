package com.mycom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Consigneeinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "consigneeinfo", catalog = "mycom")
public class Consigneeinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String school;
	private String building;
	private String room;
	private String name;
	private String phone;

	// Constructors

	/** default constructor */
	public Consigneeinfo() {
	}

	/** full constructor */
	public Consigneeinfo(User user, String school, String building,
			String room, String name, String phone) {
		this.user = user;
		this.school = school;
		this.building = building;
		this.room = room;
		this.name = name;
		this.phone = phone;
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

	@Column(name = "room", length = 10)
	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	@Column(name = "name", length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "phone", length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}