import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // showMenu();

        Doctor myDoctor = new Doctor("Montse", "Neurologist");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.specialization);

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


        // patient.setWeight(55.5);
        // System.out.println(patient.getWeight());

        // patient.setPhoneNumber("12345678");
        // System.out.println(patient.getPhoneNumber());

    }

}
