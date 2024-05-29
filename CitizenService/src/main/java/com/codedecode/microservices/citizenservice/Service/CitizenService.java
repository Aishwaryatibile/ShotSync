package com.codedecode.microservices.citizenservice.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.codedecode.microservices.citizenservice.Entity.Citizen;

@Service
public interface CitizenService {

//	public List<Citizen> findByVaccinationCenterId(Integer id);

	public Citizen saveCitizen(Citizen citizen);

	public Citizen getCitizen(Integer id);

	public List<Citizen> findByVaccinationCenterId(Integer id);

	

}
