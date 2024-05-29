package com.codedecode.microservicesdemo.vaccinationservice.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codedecode.microservicesdemo.vaccinationservice.model.Citizen;


@FeignClient(name="CITIZEN-SERVICE",url="localhost:8081",path="/citizen")

public interface CitizenProxy {
	
	@GetMapping("/vaccinationCenterId/id/{id}")
	public List<Citizen> getById(@PathVariable Integer id);
}
