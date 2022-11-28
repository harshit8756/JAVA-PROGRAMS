import java.util.Arrays;

public class arraypassinginFunction {
    public static void main(String[] args) 
    {
        int[] nums  = {12,2,4,56};
        System.out.println(Arrays.toString(nums));

        changenumber(nums); // mutability behaviour
        System.out.println(Arrays.toString(nums));
    }
      // Strings are imutable in java 
      // Array are mutiable in java
    static void changenumber(int[] arr)
    { 
        arr[3] = 78;
    }
}
