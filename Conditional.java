import java.util.Scanner;

public class Conditional{
    public static void main(String[] args) 
    {
        /*
            Syntax of the if statement :

            if(Boolean Expression T or F)
            {
                // body 
                this is use for condition statements
            }

            else
            {
                // this
            }
         */

         // salary program
         
         Scanner input =  new Scanner(System.in);
         int salary = input.nextInt();

         if(salary > 10000)
        {
            salary = salary+2000;
        }
        else{
            salary =  salary +1000;
        }

        System.out.println(salary);
    }
}