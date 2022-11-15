public class shadowinginJava {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 20; // shadowing in java to overlap numbers
        System.out.println(x);//20
        shadow();
    }

    static void shadow()
    {
        System.out.println(x);//90
    }
}
