import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) 
    {
        System.out.println("Code for Armstrong Number");
        // Scanner  input = new Scanner(System.in);
        // int n = input.nextInt();
       for(int i = 100;i<1000;i++)
       {
          if(isArmstrong(i))
          {
            System.out.println(i);
          }
       }
       
    }

    static boolean isArmstrong(int n)
    {
      int num = n;
      int sum = 0;
      while(n>0)
      {
        int rem = n %10;
        n = n/10;
        sum = sum + rem*rem*rem;
      }
      return sum == num;
    }
}
