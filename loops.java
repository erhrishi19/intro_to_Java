// A Java program for Loops 
/*      
Created by @Hrishikesh Salunkhe
*/

public class loops{
    public static void main(String[] args) {
        // 1. While loop
        //Initialization
        int x = 10;
        //Condition 
        while(x > 0) {
            System.out.println(x);
            //Increment or Decrement
            x--;
        }

        //2. For loop
        int x;
        // for(Initialization; Condition; Increment/Decrement)
        for(x =6;x>0;x-- ){
            System.out.println("Hello Java");
        }

        // 3. Do-While loop
        //Initialization
        int x = 1;
        do {
            System.out.println(x);
            //Increment/ Decrement
            x++;
            //Condtion
        } while(x < 10); 
        // Do while loop will execute for once even if condition is false
        // Because condition is checked at the last
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while(x < 0);
        

        // Now, loop control statement
        // break : terminates the loop and transfers execution 
        //         to the statement immediately following the loop.
        // continue:  makes the loop skip to its next iteration.
        int x = 1;
        //break
        while(x > 0) {
            System.out.println(x);
            if(x == 4) {
                break;
            }
            x++;
        }
        //contiunue
        for(int x=1; x<=10; x=x++) {
            if(x == 3) {
                continue;
            }
            System.out.println(x);
        }

    }
}

