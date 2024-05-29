package com.codedecode.microservicesdemo.vaccinationservice.service;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.codedecode.microservicesdemo.vaccinationservice.entity.VaccinationCenter;
import com.codedecode.microservicesdemo.vaccinationservice.model.Citizen;
import com.codedecode.microservicesdemo.vaccinationservice.model.RequiredResponse;
import com.codedecode.microservicesdemo.vaccinationservice.proxy.CitizenProxy;
import com.codedecode.microservicesdemo.vaccinationservice.repository.CenterRepo;

@Service
public class VaccinationServiceImpl implements VaccinationService {

	@Autowired
	private CitizenProxy proxy;
	@Autowired
	private CenterRepo centerrepo;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public VaccinationCenter saveCenter(VaccinationCenter vaccinationcenter) {
		// TODO Auto-generated method stub
		return centerrepo.save(vaccinationcenter);
	}

//	@Override
//	public ResponseEntity<RequiredResponse> getAllDatabasedOnCenterId(Integer id) {
//		// get vaccination center details
//		RequiredResponse requiredResponse = new RequiredResponse();
//		VaccinationCenter center = centerrepo.findById(id).get();
//		requiredResponse.setCenter(center);
//
//		// get all the citizen registered to the center
//	//	String url = "http://localhost:8081/citizen/vaccinationCenterId/id/" + center;
//
////		List<MediaType> listOfitizen = new ArrayList<MediaType>();
////		listOfitizen.add(MediaType.APPLICATION_JSON);
////		HttpHeaders headers = new HttpHeaders();
////		headers.setAccept(listOfitizen);
////		HttpEntity<Citizen> httpEntity = new HttpEntity<Citizen>(null, headers);
////		 ResponseEntity<Citizen[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, httpEntity, Citizen[].class);
////		 Citizen[] citizens = responseEntity.getBody();
//
////		HashMap<String, Integer> uriVariables = new HashMap<>();
////		uriVariables.put("id", id);
//
//		ResponseEntity<Citizen[]> listOfitizen = restTemplate
//				.getForEntity("http://localhost:8081/citizen/vaccinationCenterId/id/" + center.getId(), Citizen[].class);
//
////		Object listOfitizen = restTemplate.getForEntity("url",List.class);
//		requiredResponse.setCitizens(Arrays.asList(listOfitizen));
//		return new ResponseEntity<RequiredResponse>(requiredResponse, HttpStatus.OK);
//	}

	@Override
//	@Transactional
	public ResponseEntity<RequiredResponse> getAllDatabasedOnCenterId(Integer id) {
		// get vaccination center details

		RequiredResponse requiredResponse = new RequiredResponse();
		VaccinationCenter center = centerrepo.findById(id).get();
		
		List<Citizen> listOfCitizens = proxy.getById(id);
		
		requiredResponse.setCenter(center);
		requiredResponse.setCitizens(Arrays.asList(listOfCitizens));
		
		return new ResponseEntity<RequiredResponse>(requiredResponse, HttpStatus.OK);
	}

	public VaccinationCenter getAllDatabasedOnCenterName(String name) {
		return centerrepo.getByCenterName(name);
	}

}
