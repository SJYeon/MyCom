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
 * Spreadscore entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "spreadscore", catalog = "mycom")
public class Spreadscore implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private Integer spreadscore;
	private Date settlementtime;

	// Constructors

	/** default constructor */
	public Spreadscore() {
	}

	/** full constructor */
	public Spreadscore(User user, Integer spreadscore, Date settlementtime) {
		this.user = user;
		this.spreadscore = spreadscore;
		this.settlementtime = settlementtime;
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

	@Column(name = "spreadscore")
	public Integer getSpreadscore() {
		return this.spreadscore;
	}

	public void setSpreadscore(Integer spreadscore) {
		this.spreadscore = spreadscore;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "settlementtime", length = 0)
	public Date getSettlementtime() {
		return this.settlementtime;
	}

	public void setSettlementtime(Date settlementtime) {
		this.settlementtime = settlementtime;
	}

}