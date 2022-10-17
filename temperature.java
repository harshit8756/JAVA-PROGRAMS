import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        System.out.println("Please enter temperature in Celsius");
        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();
        float tempf = (tempC * 9/5) + 32;
        System.out.println(tempf);
    }
     
}
