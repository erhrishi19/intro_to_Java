// A Java program to perfom increment/decrement operations
/*
Created by @Hrishikesh Salunkhe
*/

public class decre_Oper{
    public static void main(String[] args) {   
        //Pre-Decrement 
        int test = 5;
        int x= --test;
        System.out.println(x);        
        System.out.println(test);
        //Post-decrement
        int test_1=5;
        int y=test_1--;
        System.out.println(y);        
        System.out.println(test_1);
    }
}