import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // here Que is an interface so cant instnt with object so Linkd list is a class in collctn
                                                // we can instsnt objct through linkd list we can also use Arraydeque instd of linkd list

           q.add(1);
           q.add(2);
           q.add(3);
           q.add(4);
           q.add(5);
           while (!q.isEmpty()){
               System.out.println(q.peek());
               q.remove();
           }

    }
}