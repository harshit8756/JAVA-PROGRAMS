import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    //    float num = input.nextFloat();
       // if we enter the integer value they convert into float because float > int , where conversion are not possible
       float num = input.nextInt();
       System.out.println(num);
    }
    
}
