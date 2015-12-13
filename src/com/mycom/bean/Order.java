package com.mycom.bean;

import java.sql.Timestamp;
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

/**
 * Order entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "order", catalog = "mycom")
public class Order implements java.io.Serializable {

	// Fields

	private Long id;
	private Proxy proxy;
	private Orderincome orderincome;
	private User user;
	private Timestamp ordertime;
	private String status;
	private String phone;
	private String name;
	private String room;
	private String school;
	private String building;
	private String settlement;
	private Set<Ordergoods> ordergoodses = new HashSet<Ordergoods>(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** full constructor */
	public Order(Proxy proxy, Orderincome orderincome, User user,
			Timestamp ordertime, String status, String phone, String name,
			String room, String school, String building, String settlement,
			Set<Ordergoods> ordergoodses) {
		this.proxy = proxy;
		this.orderincome = orderincome;
		this.user = user;
		this.ordertime = ordertime;
		this.status = status;
		this.phone = phone;
		this.name = name;
		this.room = room;
		this.school = school;
		this.building = building;
		this.settlement = settlement;
		this.ordergoodses = ordergoodses;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sender")
	public Proxy getProxy() {
		return this.proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "income")
	public Orderincome getOrderincome() {
		return this.orderincome;
	}

	public void setOrderincome(Orderincome orderincome) {
		this.orderincome = orderincome;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "ordertime", length = 0)
	public Timestamp getOrdertime() {
		return this.ordertime;
	}

	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}

	@Column(name = "status", length = 10)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "phone", length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "name", length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "room", length = 10)
	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
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

	@Column(name = "settlement", length = 5)
	public String getSettlement() {
		return this.settlement;
	}

	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
	public Set<Ordergoods> getOrdergoodses() {
		return this.ordergoodses;
	}

	public void setOrdergoodses(Set<Ordergoods> ordergoodses) {
		this.ordergoodses = ordergoodses;
	}

}