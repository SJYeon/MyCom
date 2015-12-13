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
 * Proxygoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "proxygoods", catalog = "mycom")
public class Proxygoods implements java.io.Serializable {

	// Fields

	private Long id;
	private Goods goods;
	private Proxy proxy;
	private String newdesc;

	// Constructors

	/** default constructor */
	public Proxygoods() {
	}

	/** full constructor */
	public Proxygoods(Goods goods, Proxy proxy, String newdesc) {
		this.goods = goods;
		this.proxy = proxy;
		this.newdesc = newdesc;
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
	@JoinColumn(name = "goodsid")
	public Goods getGoods() {
		return this.goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "proxyid")
	public Proxy getProxy() {
		return this.proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	@Column(name = "newdesc")
	public String getNewdesc() {
		return this.newdesc;
	}

	public void setNewdesc(String newdesc) {
		this.newdesc = newdesc;
	}

}