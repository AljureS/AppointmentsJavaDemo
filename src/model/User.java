package model;
public class User {
    private int id;
    private String name;
    private String email;
    private String adress;
    private String phoneNumber;

    public User (String name, String email){
        this.name = name;
        this.email = email; 
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getAdress() {
        return adress;
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

    @Override
    public String toString(){
        return "User:"+ name + ", email: "+ email+
        "\nAdress: "+ adress + ", phone number: "+ phoneNumber;
    }
}
