import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        // Q -: Find the nth fibonacci number,where number given by the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to be :");
        int n =  input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        int temp;

        while(count<=n)
        {
           temp = b;
           b=b+a;
           a=temp;
           count++; 
        }
        System.out.println("The output will be a :");
        System.out.println(b);
    }
}