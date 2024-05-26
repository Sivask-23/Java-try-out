import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args){
        ArrayList<Integer> l2= new ArrayList<Integer>();
        l2.add(6);
        l2.add(4);
        l2.add(3);
        l2.add(16);
        l2.add(34);
        l2.add(21);
        System.out.println(l2);
        // ascndng order
        Collections.sort(l2);
        System.out.println("Ascndng order: "+ l2);
        // descnd order
        Collections.sort(l2,Collections.reverseOrder());
        System.out.println("Descndng` order "+l2);

    }
}
