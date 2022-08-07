package com.curranwilmot.caresoftinterfaces;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    public Physician(Integer id) {
    	super(id);
    }
    // TO DO: Constructor that takes an ID
    
    public boolean assignPin(int pin) {
    	if(pin < 10000 && pin > 999) {
    		return true;
    	}
    	else return false;
    }
    
    public boolean accessAuthorized(Integer confirmAuthId) {
    	if(this.getId() == confirmAuthId) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
    // TO DO: Setters & Getters
    
}
