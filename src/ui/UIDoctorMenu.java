package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. My scheduled appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch(response){
                case 1:
                    showAddAvailableAppoitmentsMenu();
                    break;
                case 2:
                    showMyScheduledAppointmentsMenu();
                    break;
                case 0: 
                    UIMenu.showMenu();
                    break;
            }

        } while (response != 0);
    }

    private static void showAddAvailableAppoitmentsMenu(){
        int response =0;
        do {
            System.out.println();
            System.out.println(":: Add available appointment");
            System.out.println(":: Select a month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response < 4) {
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected-1]);

                System.out.println("Insert the Date available: [dd/mm/yyyy] ");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n 1. Correct \n 2. Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the Time available for date: "+ date + " [hh:mm] ");
                    time = sc.nextLine();
                    System.out.println("Your time is: " + time + "\n 1. Correct \n 2. Change Time");
                    responseTime = Integer.valueOf(sc.nextLine());

                } while (responseTime == 2);

                UIMenu.doctorLogged.addAvailableAppoitments(date, time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

            } else if (response == 0) {
                showDoctorMenu();
            }

        } while (response != 0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0 
            && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }
    }

    private static void showMyScheduledAppointmentsMenu (){
        
        System.out.println();
        System.out.println("Doctor " + UIMenu.doctorLogged.getName() + ", your available appointments are: ");

        System.out.println(UIMenu.doctorLogged.getAvailableAppointments());
    }
}
