public class function2 {
    public static void main(String[] args) {
        // only we call a function in psvm
       int ans =  sum(20,30); 
        System.out.println(ans);
    }

    // static void greeting()
    // {
    //     System.out.println("HELLO WORLD");
    //     System.out.println("MY NAME IS HARSHIT YADAV");
    // }

    // now we change the return type
    // static String  greeting(){
    //    return("hafafba");
    // }

    static int sum(int a, int b)
    {
        int c = a+b;
        return c;
    }
}


// pass the value of nummbers when you are calling the method in main()
