// A Java program for conditional statements
/*
Created by @Hrishikesh Salunkhe
*/
public class conditional{
    public static void main(String[] args) {
        int x = 18;
        // if block executed when condition is true
        // Otherwise, else block is executed
        if(x < 18) {
            System.out.println("Too Young");
        }
        else{
            System.out.println("Wel-come");
        }
        // We can use following types of conditional statemens:
        // <    less than
        // >    greater than
        // <=   less than or equal to
        // >=   greater than or equal to
        // ==   equal to
        // !=   not equal to
        int age = 25;
        if(age <= 0) {
            System.out.println("Error");
        } else if(age <= 18) {
            System.out.println("Too Young");
        } else  {
            System.out.println("Welcome!");
        }
    }
}