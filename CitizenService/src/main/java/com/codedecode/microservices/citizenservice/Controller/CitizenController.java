package com.codedecode.microservices.citizenservice.Controller;

import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codedecode.microservices.citizenservice.Entity.Citizen;
import com.codedecode.microservices.citizenservice.Service.CitizenService;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

	@Autowired
	private CitizenService citizenService;

	@RequestMapping(path = "test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("hello", org.springframework.http.HttpStatus.OK);
	}

	@PostMapping("/addcitizen")
	public ResponseEntity<Citizen> saveCitizen(@RequestBody Citizen citizen) {
		System.out.println("Citizrn data saved successfully");
		return ResponseEntity.ok(citizenService.saveCitizen(citizen));

	}

	@GetMapping("/citizenid/id/{id}")
	public ResponseEntity<Citizen> getCitizen(@PathVariable Integer id) {
		return ResponseEntity.ok(citizenService.getCitizen(id));
	}

	@GetMapping("/vaccinationCenterId/id/{id}")
	public List<Citizen> getById(@PathVariable Integer id) {
//		 List<Citizen> listCitizen = repo.findByVaccinationCenterId(id);		
//		 return new ResponseEntity<>(listCitizen,org.springframework.http.HttpStatus.OK);

		return citizenService.findByVaccinationCenterId(id);
	}

}
