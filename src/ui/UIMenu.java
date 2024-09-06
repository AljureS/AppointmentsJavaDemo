package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;
import model.Patient;

public class UIMenu {
    public static Scanner sc = new Scanner(System.in);
    
    public final static String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Select the desired option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Leave");

            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                    case 2:
                    response = 0;
                    showPatientMenu();
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a valid answer");
            }
        }while (response != 0);

    }

    private static void authUser(int userType) {
        //UserType = 1 Doc / 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Juliana Blanco","juli@mail.com"));
        doctors.add(new Doctor("Jhonny Melas","jhon@mail.com"));
        doctors.add(new Doctor("Rocio","rocio@mail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Said", "said@mail.com"));
        patients.add(new Patient("Simon", "simon@mail.com"));
        patients.add(new Patient("Kelly", "kelly@mail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Enter your email: [xxx@mail.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if(userType == 1){
                for(Doctor d : doctors){
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            } else if (userType == 2){
                for(Patient p : patients){
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }
            } else {
                System.out.println("Please enter a valid email");
            }

        } while (!emailCorrect);

    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 7; i < 10; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);

    }
}
