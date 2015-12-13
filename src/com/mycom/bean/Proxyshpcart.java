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
 * Proxyshpcart entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "proxyshpcart", catalog = "mycom")
public class Proxyshpcart implements java.io.Serializable {

	// Fields

	private Integer id;
	private Goods goods;
	private Market market;
	private Proxy proxy;
	private Integer count;

	// Constructors

	/** default constructor */
	public Proxyshpcart() {
	}

	/** full constructor */
	public Proxyshpcart(Goods goods, Market market, Proxy proxy, Integer count) {
		this.goods = goods;
		this.market = market;
		this.proxy = proxy;
		this.count = count;
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
	@JoinColumn(name = "goodsid")
	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
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

	@Column(name = "count")
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}