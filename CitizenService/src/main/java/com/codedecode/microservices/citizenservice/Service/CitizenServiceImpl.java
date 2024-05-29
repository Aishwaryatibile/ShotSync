package com.codedecode.microservices.citizenservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.codedecode.microservices.citizenservice.Entity.Citizen;
import com.codedecode.microservices.citizenservice.Repository.CitizenRepo;

@Component
public class CitizenServiceImpl implements CitizenService {

	@Autowired
	private CitizenRepo repo;

	@Override
	public Citizen saveCitizen(Citizen citizen) {
		return repo.save(citizen);
	}

	@Override
	public Citizen getCitizen(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public List<Citizen> findByVaccinationCenterId(Integer id) {
		// TODO Auto-generated method stub
		List<Citizen> listCitizen = repo.findByVaccinationCenterId(id);
	//	return (List<Citizen>) new ResponseEntity(listCitizen, HttpStatus.OK);
		return listCitizen;
	}

}
