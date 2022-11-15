import java.util.Scanner;

public class factorial {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println();
        int n = input .nextInt();
        factorial(n);
    }
    
    public static void factorial(int n)
    
    {
        int i ;
        int fact = 1;
        for(i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.printf("Factorial of "+ n +" is: "+fact);
    }
}
