import java.util.Scanner;

public class findsum {
    public static void main(String[] args) 
    {
        
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the value of n :");
     int n = input.nextInt();
     System.out.println("The sum of the number is :" + Sum(n));

    }

    public static int Sum(int n)
    {
        int sum = 0;
        for(int i = 1 ; i<=n ; i++)
        {
            sum = sum + i;
        }
        return sum;
    }
}
