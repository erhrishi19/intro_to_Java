// A Java program to perfom arithmetic operations
/*
Created by @Hrishikesh Salunkhe
*/
public class arith_oper {
    public static void main(String[] args) {
        // Create two operand 
        int op_1=10, op_2=15, op_3;
        float op_4;
        // Addition 
        op_3= op_1 +op_2;
        System.out.println(op_3);
        //Subtraction
        op_3= op_2-op_1;
        System.out.println(op_3);
        // Multiplication
        op_3=op_2*op_1;
        System.out.println(op_3);
        //Modulo(It will return Reminder)
        op_3= op_2%op_1;
        System.out.println(op_3);
        //Division
        op_4=op_2 / op_1;
        System.out.println(op_4);
    }
}