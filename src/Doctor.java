import java.util.Date;
import java.util.ArrayList;

public class Doctor extends User {
    private String speciality;


    Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es: " + name);
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

    }
} 
