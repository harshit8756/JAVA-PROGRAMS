public class functionswap 
{
  public static void main(String[] args) 
  {
    int a= 10;
    int b = 20;
   

    // Swap numbers code
    /*int temp = a;
    a=b;
    b=temp;
    System.out.println(a);
    System.out.println(b);
    */

    swap(a,b ); 
  }  

  static void swap(int a , int b)
  {
    int temp = a ;
    a=b;
    b=temp;
  }
}
 