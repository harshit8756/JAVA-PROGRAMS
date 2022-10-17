import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        
        // Check the char is lower case or upper case and also convert it to be lower case or upper case
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
       if(ch>='a' && ch<='z')
       {
        System.out.println("lower case");
       } 
       else{
        System.out.println("Upper case");
       }
    }
} 
