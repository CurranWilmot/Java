package com.curranwilmot.caresoftinterfaces;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    public AdminUser(Integer id, String role) {
    	super(id);
    	this.role = role;
    }
    
    public AdminUser(Integer id, Integer employeeID, String role) {
    	super(id);
    	this.employeeID = employeeID;
    	this.role = role;
    	
    }
    
    public boolean assignPin(int pin) {
    	if(pin > 99999) {
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    
    public boolean accessAuthorized(Integer confirmAuthId) {
    	if(this.getId() == confirmAuthId) {
    		return true;
    	}
    	else {
    		this.authIncident();
    		return false;
    	}
    }
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public ArrayList<String> reportSecurityIncidents(){
    	return this.securityIncidents;
    }
    
    public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}

	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getters

}
