package ui;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import model.Doctor;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appoitment");
            System.out.println("2. My appoitment(s)");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response =  Integer.valueOf(sc.nextLine());

            switch(response){
                case 1: 
                    showBookAppoitmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        } while (response != 0);
    }

    private static void showBookAppoitmentMenu(){
        int response = 0;
        do {
            System.out.println("::Book and appoitment");
            System.out.println(":: Select a date: ");

            //Numeracion de la lista de fechas 
            //Indice de la fecha sleccionada
            //[doctors]
            // - doctor 1
                // - [1, 2] Array de citas disponibles
            // - doctor 2
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0; // pa numerar las citas 
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                //En ese array van los doctores a los que se le asignaron citas 
                ArrayList<Doctor.AvailableAppointments>availableAppotiments
                    = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppotiments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppotiments.get(j).getDate());
                    //MAp, el indice de la cita y el doctor asociado a la cita 
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected =  Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc: doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected =doc.getValue();
            }

            System.out.println(doctorSelected.getName() + 
                ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate()+
                ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appoitment: \n1. Yes \n2. Change");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1 ) {
                UIMenu.patientLogged.addAppointmentDoctors(doctorSelected, 
                doctorSelected.getAvailableAppointments().get(indexDate).getDate(null), 
                doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPatientMenu();
            }

        } while (response != 0);
    }

    private static void showPatientMyAppointments(){
        int response = 0;
        do {
            System.out.println("::My appoitment(s)");
            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0) {
                System.out.println("You don't have any appoitment");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                    "Date: " +UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate()+
                    " Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                    "\n Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor()
                );
            }

            System.out.println("0. return"); //!
        } while (response != 0 );
    }
}
