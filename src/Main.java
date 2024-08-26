import static ui.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        // showMenu();

        Doctor myDoctor = new Doctor("Montse", "Neurologist");
        myDoctor.addAvailableAppoitments(new Date(), "4pm");
        myDoctor.addAvailableAppoitments(new Date(), "5pm");
        myDoctor.addAvailableAppoitments(new Date(), "10am");

        for (Doctor.AvailableAppointments aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patient patient = new Patient("Aleja", "aleja@mail.com");        
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");     
        
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient; // Van a la misma localidad de memoria

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        
        patient2.setName("Manuel");
        
        System.out.println(patient.getName());
        System.out.println(patient2.getName());


    }

}
