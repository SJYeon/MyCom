package com.mycom.bean;

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
 * Orderincome entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orderincome", catalog = "mycom")
public class Orderincome implements java.io.Serializable {

	// Fields

	private Long id;
	private User userBySharerid;
	private Proxy proxyByBdproxyid;
	private User userByInviterid;
	private Proxy proxyByShproxyid;

	// Constructors

	/** default constructor */
	public Orderincome() {
	}

	/** full constructor */
	public Orderincome(User userBySharerid, Proxy proxyByBdproxyid,
			User userByInviterid, Proxy proxyByShproxyid) {
		this.userBySharerid = userBySharerid;
		this.proxyByBdproxyid = proxyByBdproxyid;
		this.userByInviterid = userByInviterid;
		this.proxyByShproxyid = proxyByShproxyid;
	
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
	@JoinColumn(name = "sharerid")
	public User getUserBySharerid() {
		return this.userBySharerid;
	}

	public void setUserBySharerid(User userBySharerid) {
		this.userBySharerid = userBySharerid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bdproxyid")
	public Proxy getProxyByBdproxyid() {
		return this.proxyByBdproxyid;
	}

	public void setProxyByBdproxyid(Proxy proxyByBdproxyid) {
		this.proxyByBdproxyid = proxyByBdproxyid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inviterid")
	public User getUserByInviterid() {
		return this.userByInviterid;
	}

	public void setUserByInviterid(User userByInviterid) {
		this.userByInviterid = userByInviterid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shproxyid")
	public Proxy getProxyByShproxyid() {
		return this.proxyByShproxyid;
	}

	public void setProxyByShproxyid(Proxy proxyByShproxyid) {
		this.proxyByShproxyid = proxyByShproxyid;
	}

}