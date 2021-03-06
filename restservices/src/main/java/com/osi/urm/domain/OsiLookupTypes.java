package com.osi.urm.domain;

// Generated Dec 1, 2016 5:20:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OsiLookupTypes generated by hbm2java
 */
@Entity
@Table(name = "osi_lookup_types")
public class OsiLookupTypes implements java.io.Serializable {

	private Long id;
	private String lookupName;
	private String lookupCode;
	private Integer createdBy;
	private Date createdDate;
	private Integer updatedBy;
	private Date updatedDate;
	private Set<OsiLookupValues> osiLookupValueses = new HashSet<OsiLookupValues>(
			0);

	public OsiLookupTypes() {
	}

	public OsiLookupTypes(Long id, String lookupName, String lookupCode) {
		this.id = id;
		this.lookupName = lookupName;
		this.lookupCode = lookupCode;
	}

	public OsiLookupTypes(Long id, String lookupName, String lookupCode,
			Integer createdBy, Date createdDate, Integer updatedBy,
			Date updatedDate, Set<OsiLookupValues> osiLookupValueses) {
		this.id = id;
		this.lookupName = lookupName;
		this.lookupCode = lookupCode;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.osiLookupValueses = osiLookupValueses;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "lookup_name", nullable = false, length = 50)
	public String getLookupName() {
		return this.lookupName;
	}

	public void setLookupName(String lookupName) {
		this.lookupName = lookupName;
	}

	@Column(name = "lookup_code", nullable = false, length = 100)
	public String getLookupCode() {
		return this.lookupCode;
	}

	public void setLookupCode(String lookupCode) {
		this.lookupCode = lookupCode;
	}

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 0)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "updated_by")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 0)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "osiLookupTypes")
	public Set<OsiLookupValues> getOsiLookupValueses() {
		return this.osiLookupValueses;
	}

	public void setOsiLookupValueses(Set<OsiLookupValues> osiLookupValueses) {
		this.osiLookupValueses = osiLookupValueses;
	}

}
