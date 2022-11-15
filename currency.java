import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Indian currency...");
        float ruppess = input.nextFloat();
        float a= (float) 0.012;
        float USD = (a* ruppess);
        System.out.println("The dollar of the indian ruppess are :-");
        System.out.println(USD);
    }
}
