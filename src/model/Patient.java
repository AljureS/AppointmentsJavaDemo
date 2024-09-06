package model;

import java.util.ArrayList;
import java.util.Date;
public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);

        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }
    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }
    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    //Constructor 
    public Patient(String name, String email){
        super(name, email);
        //? Sobre escritura
        
    }
    //Getters and Setters =>Validation
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + " kg";
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String getHeight() {
        return height + " m";
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getBirthday() {
        return birthday;
    }


    public void setBlood(String blood) {
        this.blood = blood;
    }
    public String getBlood() {
        return blood;
    }

    @Override
    public String toString(){
        return super.toString() + "\nAge: "+ birthday + "\n Weight: " + getWeight() + "\n Height: " + getHeight() + "\n Blood type: " + getBlood() ;
    }

    @Override
    public void showDataUser(){
        System.out.println("Patient");
        System.out.println("Complete history");
    }

}
