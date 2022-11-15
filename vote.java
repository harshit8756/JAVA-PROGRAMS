import java.util.Scanner;

public class vote {
    public static void main(String[] args)
     {
        System.out.println("CODE FOR AGING VOTE");
        voteId(19);
    }

    public static void voteId(int n)
    {
       if(n>=18)
       {
        System.out.println("Are you eligible");
       }
       else{
        System.out.println("Are you not eligible");
       }
    }
}
