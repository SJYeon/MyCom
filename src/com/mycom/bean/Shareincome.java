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
 * Shareincome entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "shareincome", catalog = "mycom")
public class Shareincome implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private Integer sharescore;
	private Date settlementtime;

	// Constructors

	/** default constructor */
	public Shareincome() {
	}

	/** full constructor */
	public Shareincome(User user, Integer sharescore, Date settlementtime) {
		this.user = user;
		this.sharescore = sharescore;
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

	@Column(name = "sharescore")
	public Integer getSharescore() {
		return this.sharescore;
	}

	public void setSharescore(Integer sharescore) {
		this.sharescore = sharescore;
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