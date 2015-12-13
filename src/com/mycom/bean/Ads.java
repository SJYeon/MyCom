package com.mycom.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ads entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ads", catalog = "mycom")
public class Ads implements java.io.Serializable {

	// Fields

	private Integer id;
	private String adpic;
	private String src;

	// Constructors

	/** default constructor */
	public Ads() {
	}

	/** full constructor */
	public Ads(String adpic, String src) {
		this.adpic = adpic;
		this.src = src;
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

	@Column(name = "adpic", length = 100)
	public String getAdpic() {
		return this.adpic;
	}

	public void setAdpic(String adpic) {
		this.adpic = adpic;
	}

	@Column(name = "src", length = 100)
	public String getSrc() {
		return this.src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

}