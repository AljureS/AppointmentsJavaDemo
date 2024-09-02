import static ui.UIMenu.*;

import java.util.Date;

import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

public class Main {
    public static void main(String[] args) throws Exception {
        // showMenu();

        Doctor myDoctor = new Doctor("Montse", "Neurologist");
        myDoctor.addAvailableAppoitments(new Date(), "4pm");
        myDoctor.addAvailableAppoitments(new Date(), "5pm");
        myDoctor.addAvailableAppoitments(new Date(), "10am");

        System.out.println(myDoctor);
        // for (Doctor.AvailableAppointments aA : myDoctor.getAvailableAppointments()) {
        //     System.out.println(aA.getDate() + " " + aA.getTime());
        // }

        User user = new Doctor("Anahi", "anahi@mail.com");
        user.showDataUser();

        User user2 = new Patient("Anahi", "anahi@mail.com");
        user2.showDataUser();

        User user1 = new User("Simon", "simon@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Roja");
                System.out.println("Department: Neurologia");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                
            }
        };

        // Patient patient = new Patient("Aleja", "aleja@mail.com");        
        // System.out.println(patient);

    }

}
