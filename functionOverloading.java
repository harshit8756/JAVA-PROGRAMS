public class functionOverloading {
    public static void main(String[] args) 
    {
        fun(10);
        fun("HARSHIT");
    }

    // Function overloading
    static void fun(int a)
    {
     System.out.println(a);
    }

    static void fun(String b)
    {
            System.out.println(b);
    }
}
