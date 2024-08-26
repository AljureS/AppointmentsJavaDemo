public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Constructor 
    Patient(String name, String email){
        super(name, email);
    }
    //Getters and Setters =>Validation
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight + " kg";
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String getHeight() {
        return height + " m";
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getBirthday() {
        return birthday;
    }


    public void setBlood(String blood) {
        this.blood = blood;
    }
    public String getBlood() {
        return blood;
    }

}
