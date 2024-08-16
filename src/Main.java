import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Monste Aljure";
        myDoctor.showName();
        myDoctor.showId();
        
        Doctor MyDoctorAnn = new Doctor();
        MyDoctorAnn.showId();


        showMenu();
    }

}
