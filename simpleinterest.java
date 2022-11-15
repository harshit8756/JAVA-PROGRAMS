import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value of the given input :-");
        System.out.println("Principle...");
        float principle = input.nextFloat();
        System.out.println("Rate...");
        float rate = input.nextFloat();
        System.out.println("Time...");
        int time = input.nextInt();

        float SI = (principle*rate*time)/100;
        System.out.println("The simple interest is:-");
        System.out.println(SI);

    }
}
