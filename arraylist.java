import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class arraylist {
    public static void main(String[] args) 
    {
        // Syntax for array list are :-
        ArrayList<Integer> list = new ArrayList<>(); 
        // initial capacity : 10
        list.add(12);
        list.add(16);
        list.add(14);
        list.add(15);
        list.add(13);


        // System.out.println(list.contains(12));
        // System.out.println(list);
        // list.set(0,45); // it can change the integer value or we can say that update the value
        list.remove(13);
        System.out.println(list);
    }
}
