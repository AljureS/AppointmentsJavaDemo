package model;

import java.util.Date;

public class AppointmentNurse implements ISchedulable {
    private int id;
    private Patient patient;
    private Nurse doctor;
    private Date date;
    private String time;
    
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Nurse getDoctor() {
        return doctor;
    }
    public void setDoctor(Nurse doctor) {
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {
        
    }
}
