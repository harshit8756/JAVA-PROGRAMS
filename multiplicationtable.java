import java.util.Scanner;

public class multiplicationtable 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number-:");
        int num = input.nextInt();
        System.out.println("The table of a given number is:-");
        for(int i = 1;i<=10;++i)
        {
            int t = num*i;
            System.out.println(t);
        }
       
    }

}
