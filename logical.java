// A Java program for Logical Operators
/*
Created by @Hrishikesh Salunkhe
*/
public class logical{
    public static void main(String[] args) {
        // we will check, a candidate can vote or not
        // Candidate can vote if have voter ID and age greater than 18
        // We will check it using AND logical operators        
        int age = 22;
        String voterID ="yes";        
        if (age > 18 && voterID == "yes") {
            System.out.println("Welcome!");
        }
        else{
            System.out.println("Too Young");
        }


        // We will check, Validity of Student regarding citienship of country or not 
        // student is valid if he/she have aadhar or pan card or voter ID
        // We will check it using OR logical operators        
        String panCard="Yes";
        String aadhar= "yes";
        String voterID ="yes";        
        if (panCard == "Yes" || voterID == "yes" || aadhar =="yes") {
            System.out.println("Welcome!");
        }
        else{
            System.out.println("Too Young");
        }

        // Use of NOT logical operator        
        int age = 25;
        if(!(age > 18)) {
            System.out.println("Too Young");
        } else {
            System.out.println("Welcome");
        }
    }
}