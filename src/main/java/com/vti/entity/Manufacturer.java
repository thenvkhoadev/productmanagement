package com.vti.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Manufacturer")
public class Manufacturer implements Serializable {
	@Column(name = "ManufacturerId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;

	@Column(name = "ManufacturerName", nullable = false, unique = true)
	@Enumerated(EnumType.STRING)
	private ManufacturerName name;

	@OneToMany(mappedBy = "manufacturer")
	private List<Product> products;

	public Manufacturer() {
		super();
	}

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public ManufacturerName getName() {
		return name;
	}

	public void setName(ManufacturerName name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
