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
 * Ordergoods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ordergoods", catalog = "mycom")
public class Ordergoods implements java.io.Serializable {

	// Fields

	private Long id;
	private Goods goods;
	private Order order;
	private Double goodsprice;
	private String goodspic;
	private Integer count;
	private String goodsname;

	// Constructors

	/** default constructor */
	public Ordergoods() {
	}

	/** full constructor */
	public Ordergoods(Goods goods, Order order, Double goodsprice,
			String goodspic, Integer count, String goodsname) {
		this.goods = goods;
		this.order = order;
		this.goodsprice = goodsprice;
		this.goodspic = goodspic;
		this.count = count;
		this.goodsname = goodsname;
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
	@JoinColumn(name = "orderid")
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Column(name = "goodsprice", precision = 10)
	public Double getGoodsprice() {
		return this.goodsprice;
	}

	public void setGoodsprice(Double goodsprice) {
		this.goodsprice = goodsprice;
	}

	@Column(name = "goodspic", length = 100)
	public String getGoodspic() {
		return this.goodspic;
	}

	public void setGoodspic(String goodspic) {
		this.goodspic = goodspic;
	}

	@Column(name = "count")
	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Column(name = "goodsname", length = 50)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

}