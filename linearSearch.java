public class linearSearch {
    public static void main(String[] args) 
    {
        int[] nums = {12,3,34,53,15,98,75,67};
        int target = 689;
        boolean ans = linearSearch(nums , target);
        System.out.print("The element found on the index :");
        System.out.print(ans);
    }
    static boolean linearSearch(int[] arr , int target)
    {
      if(arr.length==0)
      {
        return false;
      }
      for(int i=0;i<arr.length;i++)
      {
        int element = arr[i];
        if(element==target)
        {
            return true;
        }
      } return false;
    }
}
