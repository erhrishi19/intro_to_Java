// A Java program to perfom increment operations
/*
Created by @Hrishikesh Salunkhe
*/

public class incre_Oper{
    public static void main(String[] args) {
        //Pre-increment
        int test = 5;
        int x= ++test;
        System.out.println(x);        
        System.out.println(test);
        //post-Increment
        int test_1=5;
        int y=test_1++;
        System.out.println(y);        
        System.out.println(test_1);

    }
}