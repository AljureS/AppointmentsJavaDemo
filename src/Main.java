import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // showMenu();

        Doctor myDoctor = new Doctor("Montse", "Neurologist");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.specialization);

        Patient patient = new Patient("Aleja", "aleja@mail.com");



    }

}
