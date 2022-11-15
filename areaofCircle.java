import java.util.Scanner;

public class areaofCircle {
    public static void main(String[] args) 
    {
        System.out.println("Write the code of the Area of circle");
         int r ;
         Scanner input = new Scanner(System.in);
         System.out.println("The radius of the circle is:");
         r = input.nextInt();
         double pi = 3.14;
         double area;
         area = pi * r*r;
         System.out.println(area);
         

    }
}
