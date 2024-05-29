package com.codedecode.microservicesdemo.vaccinationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.microservicesdemo.vaccinationservice.entity.VaccinationCenter;
import com.codedecode.microservicesdemo.vaccinationservice.model.RequiredResponse;
import com.codedecode.microservicesdemo.vaccinationservice.service.VaccinationService;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {

	@Autowired 
	private VaccinationService vaccinationservice;
	
	@PostMapping("/add")
	public ResponseEntity<VaccinationCenter> saveCenter(@RequestBody VaccinationCenter vaccinationcenter) {
		return ResponseEntity.ok(vaccinationservice.saveCenter(vaccinationcenter));
	}
	
	@GetMapping("/id/{id}")
	public HttpEntity<ResponseEntity<RequiredResponse>> getAllDatabasedOnCenterId(@PathVariable("id") Integer id)
	{
		return ResponseEntity.ok(vaccinationservice.getAllDatabasedOnCenterId(id)) ;	
	}
	
	@GetMapping("/centerName/{name}")
	public ResponseEntity<VaccinationCenter> getAllDatabasedOnCenterName(@PathVariable String name)
	{
		return ResponseEntity.ok(vaccinationservice.getAllDatabasedOnCenterName(name)) ;	
	}

}
