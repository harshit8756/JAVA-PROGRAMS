import java.util.Scanner;

public class sumoftwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        input.close();
        sum(num1,num2);
    }

    public static void sum(int num1, int num2){
        int num = 0;
        num  = num1 + num2;
         System.out.println("Sum of the two numbers are :" + num);

    }
}
