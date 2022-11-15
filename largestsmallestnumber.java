import java.util.Scanner;

public class largestsmallestnumber {
    public static void main(String[] args) {
        System.out.println("Code for finding largest and smallest among three numbers");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        System.out.println("Enter the third number:");
        int num3 = input.nextInt();
        input.close();
        int largest = Largest(num1 , num2 , num3);
        int smallest = Smallest(num1 , num2 , num3);

        

        System.out.printf("The largest number from : %d , %d  and %d  is %d ",num1 , num2, num3 , largest);
        System.out.printf("%The smallest number from : %d , %d  and %d  is %d",num1 , num2, num3 , smallest);
        
    }

    public static int Largest(int num1 , int num2 , int num3)
    {
       if(num1 > num2)
       {
        return num1;
       } 

       else if(num2 > num3)
       {
        return num2;
       }
       else
       {
        return num3;
       }
    }

    public static int Smallest(int num1,int num2,int num3)
    {
         if(num1<num2)
         {
            return num1;
         }

         else if(num2<num3)
         {
            return num2;
         }

         else
         {
            return num3;
         }
    }


}
