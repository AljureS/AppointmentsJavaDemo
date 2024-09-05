package model;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Doctor extends User {
    private String speciality;
    private ArrayList<AvailableAppointments> availableAppotiments = new ArrayList<>();

    public Doctor(String name, String email){
        super(name, email); // para llamar al constructor de la clase padre
        // System.out.println("El nombre del doctor asignado es: " + name);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void addAvailableAppoitments (String date, String time){
        availableAppotiments.add(new AvailableAppointments(date, time));
    }
    public ArrayList<AvailableAppointments> getAvailableAppointments(){
        return availableAppotiments;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable Appointments: " + availableAppotiments;
    }

    @Override
    public void showDataUser(){
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Deparamento: Neurologia");
    }

    public static class AvailableAppointments {    
        private int id_availableAppointments;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointments(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate(){
            return format.format(date);
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
