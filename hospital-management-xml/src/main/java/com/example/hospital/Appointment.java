package com.example.hospital;

public class Appointment {
	private int appointmentId;
    private String doctorName;
	public Appointment() {}

	public Appointment(int appointment, String doctorname){
		this.appointmentId = appointmentId;
		this.doctorName = doctorName;
	}
	
	public void setAppointmentId(int appointmentId) {
	    this.appointmentId = appointmentId;
	}
	
	public int getAppointmentId() {
	    return appointmentId;
	}
	
	public void setDoctorName(String doctorName) {
	    this.doctorName = doctorName;
	}
	public String getDoctorName() {
        return doctorName;
    }

	
	public void bookAppointment() {
		System.out.println("Appointment booked successfuly! - "+doctorName+ appointmentId);
	}
	public void cancelAppointment() {
		System.out.println("Appointment cancelled! = ");
	}
}
