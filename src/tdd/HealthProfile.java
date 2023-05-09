package tdd;

import java.time.LocalDate;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private double height;
    private double weight;


    public HealthProfile(String firstName, String lastName, String gender, String dateOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public  int calculateAge(){
        String yearOfBirth="";
        for(int index = dateOfBirth.length()-4;index<dateOfBirth.length();index++){
            char getSingleValue = dateOfBirth.charAt(index);
            yearOfBirth = yearOfBirth + getSingleValue;
        }
        int years = Integer.parseInt(yearOfBirth);
        LocalDate currentDate = LocalDate.now();


        return currentDate.getYear() - years;
    }
    public int getmaximumHeartRate(int age){
        return 220-age;

    }

}
