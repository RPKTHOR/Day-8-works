package com.example.hospital;

public class Patient {
	private int id;
    private String name;
    
    public Patient() {}
    
    public int getId() { 
    	return id; 
    }
    
    public int setId(int id) {
    	return this.id = id;
    }
    
    public void setName(String name) { this.name = name; }
    
    public void registerPatient() {
        System.out.println("Patient registered."+name+id);
    }

    public void getPatientDetails() {
        System.out.println("patient details..."+name+id);
    }
}
