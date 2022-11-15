public class pythogorastriplet {
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6};
        int size = arr.length;
        if(isTriplet(arr,size)==true)
        {
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }

    static boolean isTriplet(int arr[] , int n)
    {
        for(int i = 0; i<n ;i++)
        {
            for(int j = i+1;j<n ; j++)
            {
                for(int k = j+1 ; k<n ; k++)
                {
                    int x = arr[i] * arr[i] ;
                    int y  =arr[j] * arr[j];
                    int z  = arr[k] * arr[k];

                    if(x==y+z || y==z+x || z==x+y)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
