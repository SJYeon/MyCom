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
 * Goodspic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "goodspic", catalog = "mycom")
public class Goodspic implements java.io.Serializable {

	// Fields

	private Long id;
	private Goods goods;
	private String src;

	// Constructors

	/** default constructor */
	public Goodspic() {
	}

	/** full constructor */
	public Goodspic(Goods goods, String src) {
		this.goods = goods;
		this.src = src;
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

	@Column(name = "src", length = 100)
	public String getSrc() {
		return this.src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

}