package com.codedecode.microservices.citizenservice.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.codedecode.microservices.citizenservice.Entity.Citizen;

@Repository
@Component
public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

	List<Citizen> findByVaccinationCenterId(Integer id);
	
	

	

}
