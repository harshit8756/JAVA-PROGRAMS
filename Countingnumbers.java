// import java.util.Scanner;

public class Countingnumbers 
{
 public static void main(String[] args) 
 {
    int n = 1525565565;
    int rem ; 
    int count = 0;

    while(n>0)
    {
        rem = n %10;
        if(rem == 5)
        {
            count++;
        }
        n = n/10;
    }
    System.out.println(count);
      
 }
}
