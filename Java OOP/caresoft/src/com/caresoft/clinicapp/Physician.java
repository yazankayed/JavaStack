package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an IDcopy
	public Physician(int IDcopy) {
		this.id=IDcopy;
	}
    // TO DO: Implement HIPAACompliantUser!
    public boolean assignPin(int pin){
    	if (pin>=4) {
    		this.pin=pin;
    		return true;}
    	else {
    		return false;}
    	
    }
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
    public  boolean accessAuthorized(Integer confirmedAuthID) {
    	if (id==confirmedAuthID) {
    		return true;	}
    	else {
    		
    		return false;
    		
    	}
    }
	
    // TO DO: Setters & Getters
}
