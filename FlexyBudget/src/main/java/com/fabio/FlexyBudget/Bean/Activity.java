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

@Entity
@Table(name="Activity")
public class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	@Basic
	@Column(name="name", length=30, nullable=false)
	private String name; 
	@Temporal(TemporalType.DATE)
	@Column(name="gdh", nullable=false)
	private Date gdh;
	@Basic
	@Column(name="price", nullable=false)
	private float price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="envelopeId_fk")
	private Envelope envelope;
	public int getId() {
		return id;  
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getGdh() {
		return gdh;
	}
	public void setGdh(Date gdh) {
		this.gdh = gdh;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Envelope getEnvelope() {
		return envelope;
	}
	public void setEnvelope(Envelope envelope) {
		this.envelope = envelope;
	}
}
