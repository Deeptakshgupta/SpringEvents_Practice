package com.springEvents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springEvents.dto.PatientDischargeRequest;
import com.springEvents.service.PatientDischargeService;

@RestController
@RequestMapping("/discharge/api")
public class DischargeProcessController {

	@Autowired
	private PatientDischargeService patientDischargeService;
	
	@PostMapping("/process")
	public String dischargePatient(@RequestBody PatientDischargeRequest request) {
		 return patientDischargeService.dischargePatient(request.getPatientId(), request.getPatientName());
		    
	}
	
}
