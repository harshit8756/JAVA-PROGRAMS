import java.util.Scanner;

public class evenodd 
{
 public static void main(String[] args) {
    // Check the given number from the user is even or odd...
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number :-");
    int num = input.nextInt();
    if(num%2==0)
    {
        System.out.println("The given number is even");
    }

    else{
        System.out.println("The given number is odd");
    }
 }   
}
