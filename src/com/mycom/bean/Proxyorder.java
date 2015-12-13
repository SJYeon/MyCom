package com.mycom.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
 * Proxyorder entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "proxyorder", catalog = "mycom")
public class Proxyorder implements java.io.Serializable {

	// Fields

	private Integer id;
	private Market market;
	private Proxy proxy;
	private Timestamp ordertime;
	private String marketname;
	private String status;
	private List<Proxyordergoods> proxyordergoodses = new ArrayList<Proxyordergoods>(
			0);

	// Constructors

	/** default constructor */
	public Proxyorder() {
	}

	/** full constructor */
	public Proxyorder(Market market, Proxy proxy, Timestamp ordertime,
			String marketname, String status) {
		this.market = market;
		this.proxy = proxy;
		this.ordertime = ordertime;
		this.marketname = marketname;
		this.status = status;
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
	@JoinColumn(name = "marketid")
	public Market getMarket() {
		return this.market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proxyid")
	public Proxy getProxy() {
		return this.proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	@Column(name = "ordertime", length = 0)
	public Timestamp getOrdertime() {
		return this.ordertime;
	}

	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}

	@Column(name = "marketname", length = 20)
	public String getMarketname() {
		return this.marketname;
	}

	public void setMarketname(String marketname) {
		this.marketname = marketname;
	}

	@Column(name = "status", length = 10)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}