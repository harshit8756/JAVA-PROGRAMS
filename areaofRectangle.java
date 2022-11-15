import java.util.Scanner;

public class areaofRectangle {
    public static void main(String[] args) {
        // the area of the rectangle are :- area = length * width
        int len , width ,area ;
        System.out.println("Enter the value of lenght and width are :");
        Scanner input = new Scanner(System.in);
        len = input.nextInt();
        width = input.nextInt();
         area = len * width ;
         System.out.println("The area of the rectangle are :");
         System.out.println(area);
    }
}
