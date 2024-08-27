import static ui.UIMenu.*;

import java.util.Date;

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

        Patient patient = new Patient("Aleja", "aleja@mail.com");        
        System.out.println(patient);

    }

}
