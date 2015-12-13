package com.mycom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Proxyordergoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "proxyordergoods", catalog = "mycom")
public class Proxyordergoods implements java.io.Serializable {

	// Fields

	private Integer id;
	private Goods goods;
	private Proxyorder proxyorder;
	private String goodsname;
	private Double goodsprice;
	private Integer count;
	private String goodspic;

	// Constructors

	/** default constructor */
	public Proxyordergoods() {
	}

	/** minimal constructor */
	public Proxyordergoods(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Proxyordergoods(Integer id, Goods goods, Proxyorder proxyorder,
			String goodsname, Double goodsprice, Integer count, String goodspic) {
		this.id = id;
		this.goods = goods;
		this.proxyorder = proxyorder;
		this.goodsname = goodsname;
		this.goodsprice = goodsprice;
		this.count = count;
		this.goodspic = goodspic;
	}

	// Property accessors
	@Id
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
	@JoinColumn(name = "proxyorderid")
	public Proxyorder getProxyorder() {
		return this.proxyorder;
	}

	public void setProxyorder(Proxyorder proxyorder) {
		this.proxyorder = proxyorder;
	}

	@Column(name = "goodsname", length = 50)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "goodsprice", precision = 10, scale = 0)
	public Double getGoodsprice() {
		return this.goodsprice;
	}

	public void setGoodsprice(Double goodsprice) {
		this.goodsprice = goodsprice;
	}

	@Column(name = "count")
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Column(name = "goodspic", length = 100)
	public String getGoodspic() {
		return this.goodspic;
	}

	public void setGoodspic(String goodspic) {
		this.goodspic = goodspic;
	}

}