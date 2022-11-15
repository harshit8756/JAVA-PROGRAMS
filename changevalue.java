import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) // main function code
     {
        // change number in array
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums) // function
    {
        nums[0] = 99; // creating new object 
    }
}
