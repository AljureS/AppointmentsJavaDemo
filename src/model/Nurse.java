package model;

import java.util.ArrayList;
import java.util.Date;

public class Nurse extends User {
    private String speciality;

    public Nurse(String name, String email){
        super(name, email); // para llamar al constructor de la clase padre
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointments> availableAppotiments = new ArrayList<>();
    public void addAvailableAppoitments (Date date, String time){
        availableAppotiments.add(new AvailableAppointments(date, time));
    }
    public ArrayList<AvailableAppointments> getAvailableAppointments(){
        return availableAppotiments;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable Appointments: " + availableAppotiments;
    }

    public static class AvailableAppointments {    
        private int id_availableAppointments;
        private Date date;
        private String time;

        public AvailableAppointments(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
        }
        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }

        public int getId_availableAppointments() {
            return id_availableAppointments;
        }
        public void setId_availableAppointments(int id_availableAppointments) {
            this.id_availableAppointments = id_availableAppointments;
        }

        @Override
        public String toString(){
            return "Available Appointments: \n" +date + " at " + time;
        }

    }
}
