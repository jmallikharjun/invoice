package com.example.invoiceMvn;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mvn_invoice")
public class Invoice {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String location;
	private Double amount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	//getAmount
	public Double getAmount() {
		return amount;
	}

	//setAmount
	public void setAmount(Double amount) {
		this.amount = amount;
	}

}