public class Patient {
    int id;
    private String name;
    private String email;
    private String adress;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Constructor 
    Patient(String name, String email){
        this.name = name;
        this.email = email; 
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
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getBirthday() {
        return birthday;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getAdress() {
        return adress;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    public String getBlood() {
        return blood;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("Please enter a valid phone number");
        } else if (phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
        
    }
    public String getPhoneNumber() {

        return phoneNumber;
    }

}
