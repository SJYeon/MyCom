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
 * Proxyincome entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "proxyincome", catalog = "mycom")
public class Proxyincome implements java.io.Serializable {

	// Fields

	private Integer id;
	private Proxy proxy;
	private Double income;
	private Date settlementtime;

	// Constructors

	/** default constructor */
	public Proxyincome() {
	}

	/** full constructor */
	public Proxyincome(Proxy proxy, Double income, Date settlementtime) {
		this.proxy = proxy;
		this.income = income;
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
	@JoinColumn(name = "proxyid")
	public Proxy getProxy() {
		return this.proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	@Column(name = "income", precision = 10, scale = 0)
	public Double getIncome() {
		return this.income;
	}

	public void setIncome(Double income) {
		this.income = income;
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