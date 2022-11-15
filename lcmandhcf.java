import java.util.Scanner;

public class lcmandhcf 
{
    public static void main(String[] args) 
    {
        
    /*
     GCD or HCF :- largest integer that can exactly divisible both number without any remainder
     LCM :- LCM = (n1 * n2) / GCD  ... Smallest integer that is perfectly divisible by both the numbers
     */
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the two numbers :-");
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      int gcd = 1;
      int min = (num1>num2)?num2:num1;
      for(int i=1;i<=num1;i++)
      {
        if(num1%i==0 && num2%i==0)
        {
            gcd= i;
        }
        
      }
      System.out.println("The gcd of the two numbers is:-");
      System.out.println(gcd);
      int lcm = 1;
      lcm = (num1 * num2) / gcd;
      System.out.println("The lcm of the two numbers are :-");
      System.out.println(lcm);


    
    }
    
}
