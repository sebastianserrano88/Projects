package BMI_Health;

import java.util.Scanner;
public class Person {
//declare the paramaters as private in the person class
    private String lastName;
    private String firstName;
    private double heightInches;
    private double weightPounds;

    public Person(String lastName, String firstName, double heightInches, double weightPounds){
        this.lastName = lastName;
        this.firstName = firstName;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

//make the getters and setters within our constructor
        public String lastName(){
            return lastName;
        }
        public void setlastName(String lastName){
            this.lastName = lastName;
        }
        public String firstName(){
        return firstName;
    }
        public void setfirstName(String firstName){
        this.firstName = firstName;
    }
        public double heightInches(){
            return heightInches;
    }
        public void setHeightInches(double heightInches){
            this.heightInches = heightInches;
        }
        public double weightPounds(){
        return weightPounds;
    }
        public void setWeightPounds(double weightPounds){
        this.weightPounds = weightPounds;
    }
//making the toString that lays the common things out
    public String toString(){
        return firstName + " " + lastName + " weighs pounds " + weightPounds + " and measures " + heightInches + " inches tall.";
    }
//making the recommended weight method with the given formula
    public double recommendedWeight(){
        double optimumWeight = 0;
        optimumWeight = ((25*Math.pow(heightInches,2))/703);
        return optimumWeight;
    }
//making the calculatebmi method that uses the given formula
    public double calculateBMI(){
        double bmi = 0;
        bmi = ((weightPounds/(heightInches * heightInches))*703);
        return bmi;
    }
//making the determine health method given the instructions that we were told to follow aka the parameters
    public String determineHealth(double aBMI){
        String healthStatus = "";
        if (aBMI < 18.5){
            healthStatus = "You are underweight. BMI below 18.5 is considered underweight.";
        }
        else if (aBMI >= 18.5 && aBMI < 25){
            healthStatus = "Healthy";
        }
        else if (aBMI >= 25 && aBMI < 30){
            healthStatus = "You are considered overweight. BMI greater or equal than 25 and less than 30 is considered";
        }
        else if (aBMI >= 30 && aBMI <= 39.9){
            healthStatus = "You are considered obese. BMI greater or equal than 30 and less or equal than 39.9 is considered obese.";
        }
        else {
            healthStatus = "You are considered extremely obese. BMI above 39.9 is considered extremely obese.";
        }
        return healthStatus;
    }



}
