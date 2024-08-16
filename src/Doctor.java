public class Doctor {

    static int id = 0;
    String name;
    String specialization;

    Doctor(){
        System.out.println("Creating the obj Doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }

    //Behaviors
    public void showName(){
        System.out.println("Dr." + name);
    }

    public void showId (){
        System.out.println("Id doctor: " + id);
    }
}
