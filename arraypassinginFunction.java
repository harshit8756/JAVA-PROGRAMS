import java.util.Arrays;

public class arraypassinginFunction {
    public static void main(String[] args) 
    {
        int[] nums  = {12,2,4,567};
        System.out.println(Arrays.toString(nums));

        changenumber(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void changenumber(int[] arr)
    {
        arr[3] = 78;
    }
}
