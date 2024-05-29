package com.codedecode.microservicesdemo.vaccinationservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="VaccinantionCenterService")
public class VaccinationCenter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String centerName;
	
	private String centerAddress;

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterAddress() {
		return centerAddress;
	}

	public void setCenterAddress(String centerAddress) {
		this.centerAddress = centerAddress;
	}

//	public VaccinationCenter(Integer id, String centerName, String centerAddress) {
//		super();
//		this.id = id;
//		this.centerName = centerName;
//		this.centerAddress = centerAddress;
//	}
//
//	public VaccinationCenter() {
//		super();
//	}

	@Override
	public String toString() {
		return "VaccinationCenter [id=" + id + ", centerName=" + centerName + ", centerAddress=" + centerAddress + "]";
	}
	
	
	
	
	
	

}
