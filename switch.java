// A Java program for Switch Statement
/*      
Created by @Hrishikesh Salunkhe
*/

public class switch{
    public static void main(String[] args) {

        int day = 3;
        //Create a switch statement 
        
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            //default will execute when none of case is executed    
            default:
                System.out.println("Invalid Day");
                break;

        }
    }
}