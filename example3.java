import java.util.Scanner;

public class example3 
{

    public static void main(String[] args) 
    {
    
        Scanner input = new Scanner(System.in);
        System.out.println("The largest of the three numbers are as follows :-");
        // take three input from the users...
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Q -: Find the largest of the 3 numbers..
       
        /*if(a>b){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);    
        }
        else{
            System.out.println(c);
        }
        */

        int max =  Math.max(c,Math.max(a,b));
        System.out.println(max);
        }
        
    }

