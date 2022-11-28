import java.util.Arrays;
import java.util.Scanner;

public class twodArrays 
{
    public static void main(String[] args) 
    {
       // 2-D arrays is like a matrix form
       /*  
         1 2 3
         4 5 6 
         7 8 9
       
       */ 

       // representations of 1 -D array
        //int[]  arr = new int[];

        /* Representation of 2-D array
         
        int[][] arr = new int[][] ----> columns 
                              |
                              |
                              rows
         rows are mandatory to fill in the array
         */
         
        //  int[][] arr = 
        //  { //0 1 2   
        //     {1,2,3},// 0
        //     {4,5,6},// 1
        //     {7,8,9} // 2

        // input from user in 2d array
        Scanner input = new Scanner(System.in);
        int [][] arr = new int[3][3];
        System.out.println(arr.length);
        // it gives the number of rows
        for(int row=0;row<arr.length;row++ )
          {
            for(int col = 0; col<arr[row].length; col++)
            {
              arr[row][col] =  input.nextInt();
            }
          }
         

          for(int row=0;row<arr.length;row++ )
          {
            for(int col = 0; col<arr[row].length; col++)
            {
              System.out.print(arr[row][col] + " ");
            }
            System.out.println();
          }


        }
}

    

    

