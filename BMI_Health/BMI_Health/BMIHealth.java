package BMI_Health;
import java.util.Scanner;
import java.text.DecimalFormat;
public class BMIHealth {
//we make the main part of the code which will be using the external methods and calling upon them
    public static void main (String [] args){
        Person person = createPersonObject();

        showBMI(person);
    }
//we making this method which creates an object and gets the users information and prints out a small summary of the inputs
    public static Person createPersonObject(){
        String firstName;
        String lastName;
        double height;
        double weight;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please type you first name, then last name, then your height in inches, and finally your weight in pounds:");
        firstName = scnr.next();
        lastName = scnr.next();
        height = scnr.nextDouble();
        weight = scnr.nextDouble();

        return new Person(lastName,firstName,height,weight);
    }
    //we make this method which will be the thing that calls upon the most methods and it will use everything in person to gather information and provide it to the user
    public static void showBMI(Person aPerson){
        System.out.println(aPerson);
//we call upon the bmi calculation method
        double bmi = aPerson.calculateBMI();
        System.out.printf("BMI: %.2f",bmi);
        System.out.println();
//we call upon the determinehealth method
        String healthStatus = aPerson.determineHealth(bmi);
        System.out.println("Health Status: " +healthStatus);
//we call upon the health if statements method
        if(!healthStatus.equals("Healthy")){
            double recommendedWeight = aPerson.recommendedWeight();
            System.out.println("Recommended weight: " + recommendedWeight);
        }
    }
}

