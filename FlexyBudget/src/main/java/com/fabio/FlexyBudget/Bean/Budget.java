package com.fabio.FlexyBudget.Bean;

import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="Budget")
public class Budget {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private int id ;
	@Basic
	@Column(name="title", length=50, nullable=false)
	private String title ;
	@Temporal(TemporalType.DATE)
	@Column(name="date", nullable=false)
	private Date date ;
	@Transient
	@Column(name="sumPos")
	private float sumPos ;
	@Transient
	@Column(name="sumNeg")
	private float sumNeg ;
	@Basic
	@Column(name="rest", columnDefinition="float default 0", nullable=false)
	private float rest ;
	@Basic
	@Column(name="pdfPath", length=200, nullable=true)
	private String pdfPath ;
	@Basic
	@Column(name="isArchive", columnDefinition="boolean default false")
	private boolean isArchive ;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId_fk")
	private User user ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public float getSumPos() {
		return sumPos;
	}
	public void setSumPos(int sumPos) {
		this.sumPos = sumPos;
	}
	public float getSumNeg() {
		return sumNeg;
	}
	public void setSumNeg(int sumNeg) {
		this.sumNeg = sumNeg;
	}
	public float getRest() {
		return rest;
	}
	public void setRest(int rest) {
		this.rest = rest;
	}
	public String getPdfPath() {
		return pdfPath;
	}
	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}
	public boolean isArchive() {
		return isArchive;
	}
	public void setArchive(boolean isArchive) {
		this.isArchive = isArchive;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
