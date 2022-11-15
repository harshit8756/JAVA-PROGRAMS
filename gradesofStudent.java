import java.util.Scanner;

public class gradesofStudent {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = input.nextInt();
        grades(n);
    }

    public static void grades(int n)
    {
        if(n>90 && n<100)
        {
            System.out.println("Your grades is AA");
        }

        else if(n>80 && n<91)
        {
            System.out.println("Your grades id AB");
        }

        else if(n>70 && n<81)
        {
            System.out.println("Your grades id BB");
        }

        else if(n>60 && n<71)
        {
            System.out.println("Your grades id BC");
        }

        else if(n>50 && n<61)
        {
            System.out.println("Your grades id CD");
        }
        else if(n>40 && n<51)
        {
            System.out.println("Your grades id DD");
        }
        else 
        {
            System.out.println("Your grades id fail");
        }
    }
}
