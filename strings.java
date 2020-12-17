// A Hello Java program to give introduction to Java
/*
Created by @Hrishikesh Salunkhe
*/
public class strings{
    public static void main(String[] args) {
        // Create a string
        String str="Hello";
        System.out.println(str);
        
        // We can create a empty string
        String str_1= "";
        System.out.println(str_1);
        
        // String Concatenation
        String str_2 = str + str_1;
        System.out.println(str_2);
        
        // Another Example
        String firstName, lastName;
        firstName = "Introduction to";
        lastName = "Java";
        System.out.println("Hey, Welcome to the course of " + firstName +" "+lastName);
        
    }
}