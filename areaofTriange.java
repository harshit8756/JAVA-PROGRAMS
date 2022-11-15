import java.util.Scanner;

public class areaofTriange {
  
        public static void main(String[] args) 
        {
           System.out.println("Code for find the area of the triangle0");
           Scanner input = new Scanner(System.in);
           System.out.println("Enter the three side of the triangle :");
           int a = input.nextInt(); 
           int b = input.nextInt(); 
           int c = input.nextInt(); 
           int s ;
           s = (a+b+c)/2;  // formula of the semi - perimeter ....
           System.out.println("The semi-perimeter of the triange are:");
           System.out.println(s);

           double area;
           area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); // formula of the area of the triangle
           System.out.println("The area is :5");
           System.out.println("Area of triangle :" + area);
        }
}
