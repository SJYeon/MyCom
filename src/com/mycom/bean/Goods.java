package com.mycom.bean;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "goods", catalog = "mycom")
public class Goods implements java.io.Serializable {

	// Fields

	private Long id;
	private Market market;
	private Admin admin;
	private String goodsname;
	private Double marketprice;
	private Double mallprice;
	private Double costprice;
	private String goodsdesc;
	private String type;
	private Date uploadtime;
	private String school;
	private Integer score;
	private Integer totalnum;
	private Integer salenum;
	private Boolean del;
	
	private List<Goodspic> goodspics = new ArrayList<Goodspic>(0);

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** full constructor */
	public Goods(Market market, Admin admin, String goodsname,
			Double marketprice, Double mallprice, Double costprice,
			String goodsdesc, String type, Date uploadtime, String school,
			Integer score, Integer totalnum, Integer salenum, Boolean del,
		    List<Goodspic> goodspics) {
		this.market = market;
		this.admin = admin;
		this.goodsname = goodsname;
		this.marketprice = marketprice;
		this.mallprice = mallprice;
		this.costprice = costprice;
		this.goodsdesc = goodsdesc;
		this.type = type;
		this.uploadtime = uploadtime;
		this.school = school;
		this.score = score;
		this.totalnum = totalnum;
		this.salenum = salenum;
		this.del = del;
		
		this.goodspics = goodspics;
		
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
	@JoinColumn(name = "marketid")
	public Market getMarket() {
		return this.market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uploaderid")
	public Admin getAdmin() {
		return this.admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Column(name = "goodsname", length = 50)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "marketprice", precision = 10)
	public Double getMarketprice() {
		return this.marketprice;
	}

	public void setMarketprice(Double marketprice) {
		this.marketprice = marketprice;
	}

	@Column(name = "mallprice", precision = 10)
	public Double getMallprice() {
		return this.mallprice;
	}

	public void setMallprice(Double mallprice) {
		this.mallprice = mallprice;
	}

	@Column(name = "costprice", precision = 10)
	public Double getCostprice() {
		return this.costprice;
	}

	public void setCostprice(Double costprice) {
		this.costprice = costprice;
	}

	@Column(name = "goodsdesc")
	public String getGoodsdesc() {
		return this.goodsdesc;
	}

	public void setGoodsdesc(String goodsdesc) {
		this.goodsdesc = goodsdesc;
	}

	@Column(name = "type", length = 10)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "uploadtime", length = 0)
	public Date getUploadtime() {
		return this.uploadtime;
	}

	public void setUploadtime(Date uploadtime) {
		this.uploadtime = uploadtime;
	}

	@Column(name = "school", length = 20)
	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Column(name = "score")
	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Column(name = "totalnum")
	public Integer getTotalnum() {
		return this.totalnum;
	}

	public void setTotalnum(Integer totalnum) {
		this.totalnum = totalnum;
	}

	@Column(name = "salenum")
	public Integer getSalenum() {
		return this.salenum;
	}

	public void setSalenum(Integer salenum) {
		this.salenum = salenum;
	}

	@Column(name = "del")
	public Boolean getDel() {
		return this.del;
	}

	public void setDel(Boolean del) {
		this.del = del;
	}

	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "goods")
	public List<Goodspic> getGoodspics() {
		return this.goodspics;
	}

	public void setGoodspics(List<Goodspic> goodspics) {
		this.goodspics = goodspics;
	}

	
}