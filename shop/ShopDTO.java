package com.xworkz.shop;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "shop_table")

public class ShopDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CID")
	private int shopId;
	@Column(name = "Shop_Name")
	private String shopName;
	@Column(name = "Shop_Location")
	private String shopLocation;
	@Column(name = "OwnerName")
	private String ownerName;
	@Column(name = "Open")
	private Open open;

	public ShopDTO(String shopName, String shopLocation, String ownerName, Open open) {
		super();
		this.shopName = shopName;
		this.shopLocation = shopLocation;
		this.ownerName = ownerName;
		this.open = open;
	}

}