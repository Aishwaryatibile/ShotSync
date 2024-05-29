package com.codedecode.microservicesdemo.vaccinationservice.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.codedecode.microservicesdemo.vaccinationservice.entity.VaccinationCenter;
import com.codedecode.microservicesdemo.vaccinationservice.model.RequiredResponse;
import com.codedecode.microservicesdemo.vaccinationservice.repository.CenterRepo;

@Service
public interface VaccinationService  {

	VaccinationCenter saveCenter(VaccinationCenter vaccinationcenter);

	ResponseEntity<RequiredResponse> getAllDatabasedOnCenterId(Integer id);

	VaccinationCenter getAllDatabasedOnCenterName(String name);

	






	





}
