import java.util.Arrays;

public class VariablelengthogArguments {
    public static void main(String[] args) {
        // fun("harshit , yadav , sahil , yaduvanshi");
        // fun(10,20,30,40,23,56,89,55);
        fun(20,30,"harshit, yadav , sahil , yaduvanshi , aryan ");
        
    }

    static void fun(int a , int b , String ...v)
    // static void fun(int ...v)
    // static void fun(String ...v)
    {
        
        System.out.println(Arrays.toString( v));
    }
}
