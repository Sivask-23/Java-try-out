import java.util.ArrayList;
import java.util.Scanner;

public class arlist {
    public static void main(String[] args) {
        int ele;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> l1=new ArrayList<Integer>();
      //  for (int i=1; i<=4;i++){
       //     ele=sc.nextInt();
       //     l1.add(ele); // act like append
      //  }
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(3,10);
        System.out.println(l1);
        l1.set(0,5);
        System.out.println("Size of list is "+l1.size());
        System.out.println(l1);
        l1.remove(3);
        System.out.println(l1);
        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
        }
    }
}