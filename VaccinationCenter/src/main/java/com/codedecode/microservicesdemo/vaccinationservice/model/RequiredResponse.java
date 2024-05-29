package com.codedecode.microservicesdemo.vaccinationservice.model;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.codedecode.microservicesdemo.vaccinationservice.entity.VaccinationCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RequiredResponse {

	private VaccinationCenter center;

	private List<Object> citizens;

	public VaccinationCenter getCenter() {
		return center;
	}

	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}

	public List<Object> getCitizens() {
		return citizens;
	}

	public void setCitizens(List<Object> list) {
		this.citizens = list;
	}

	@Override
	public String toString() {
		return "RequiredResponse [center=" + center + ", citizens=" + citizens + "]";
	}

//	public void setCitizens(Citizen[] listOfitizen) {
//		// TODO Auto-generated method stub
//		this.citizens = citizens;
//	}

}
