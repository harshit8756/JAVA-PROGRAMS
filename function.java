import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        
    sum(); // calling the function
    
        /*
         access modifier (we will look in OOP) return_type name()
         {
            // body

            return statement ;
         }
         */
    }
    static void sum()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numbers :");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("The output will be :");
        System.out.println(sum);
    }
}
