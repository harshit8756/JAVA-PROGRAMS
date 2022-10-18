import java.util.Scanner;

public class SwitchCase 
{
    public static void main(String[] args) 
    {
        // you take a word input from user
        Scanner input =  new Scanner(System.in); 
        String fruit = input.next();
         // Syntax of the Switch Statements are -:
         /*
         switch(expression)
         {
            //cases
            case one :
              // do something
              break; // break is used to terminate the sequence of the program

            case two :
              // do something
              break;

            default:
               // do something
         }
         */  
         switch(fruit)
         {
            case "mango":
               System.out.println("king of the fruit");
               break;

            case "orange":
              System.out.println("oval of the fruit");
              break;

            case "banana":
               System.out.println("Favoriate of the monkey");
               break;

            case "apple":
               System.out.println("dark red of the fruits");
               break;

            default:
            System.out.println("Not belong to the fruits family");
              
         }
    }
}
