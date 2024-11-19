package com.springEvents.event;

import org.springframework.context.ApplicationEvent;

import lombok.Data;

@Data
public class PatientDischargeEvent extends ApplicationEvent {

	
	private String patientId;
	private String patientName;
	
	public PatientDischargeEvent(Object source, String patientId, String patientName) {
		super(source);
		this.patientId = patientId;
		this.patientName = patientName;
		
	}
}
