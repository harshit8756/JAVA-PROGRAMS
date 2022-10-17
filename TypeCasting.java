import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    //    float num = input.nextFloat();
       // if we enter the integer value they convert into float because float > int , where conversion are not possible
      //  float num = input.nextInt();
      //  System.out.println(num);

      // convert integer to float
      // System.out.println("Type Conversion");
      // int num1 = (int) (254.15); // float to int
      // float num = (float) (25);  // int to float
      // System.out.println(num1); 
      // System.out.println(num);

      // automatic type promotion in expressions
       
      // int s = 258;
      // byte b = (byte) (s); // it gives the remainder of the integer value
      // System.out.println(b); // 258 % 256 = 2 
    
      // int num = 'A';
      // int num = 'a'; // gives the ASCII value of the character
      
      // java work on unicode values...
      // System.out.println(num);

      byte b = 42;
      char c = 'a';
      int i = 5000;
      float f = 25.45f ;
      short s = 1024;
      double d = 0.1234;
      double result = (f*b) + (i/c) - (d-s);
      System.out.println((f*b) + " " + (i/c) + " " + (d-s));
       System.out.println(result);
   
   }
    
}
