package com.codedecode.microservicesdemo.vaccinationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codedecode.microservicesdemo.vaccinationservice.entity.VaccinationCenter;

@Repository
public interface CenterRepo extends JpaRepository<VaccinationCenter, Integer> {

	VaccinationCenter getByCenterName(String name);

}
