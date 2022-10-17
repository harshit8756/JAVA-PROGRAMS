import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.SortOrder;

public class CalculatorProgram 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while(true)
        {
            System.out.println("Enter the operator");
            char op = input.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%')
            {
                System.out.println("Please enter the two numbers");
                int a = input.nextInt();
                int b = input.nextInt();

                if(op=='+')
                {
                    ans = a+b;
                }

                if(op=='-')
                {
                    ans = a-b;
                }

                if(op=='*')
                {
                    ans = a*b;
                }

                if(op=='%')
                {
                    ans =a%b;
                }

                if(op=='/')
                {
                    if(b!=0)
                    {
                       ans = a/b;
                    }
                }

                else if(op=='x' || op=='X')
                {
                    break;
                }
            }
            else
                {
                   System.out.println("It is the invalid operator");
                }
            
            System.out.println(ans);
        }
    }
}
       


