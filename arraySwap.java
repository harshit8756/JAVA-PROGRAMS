import java.util.Arrays;

public class arraySwap {
    public static void main(String[] args) {
        int[] arr = {1,12,3,64,85};
        swap(arr,0,2);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,  int index1 , int index2)
    {
        int temp = arr[index1];
        arr[index2] = arr[index1];
        arr[index2] = temp;
    }
}
