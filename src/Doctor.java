public class Doctor {

    static int id = 0;
    String name;
    String email;
    String specialization;

    Doctor(){
        System.out.println("Creating the obj Doctor");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor asignado es: " + name);
        id++;
        this.name = name;
        this.specialization = speciality;
    }

    //Behaviors
    public void showName(){
        System.out.println("Dr." + name);
    }

    public void showId (){
        System.out.println("Id doctor: " + id);
    }
}
