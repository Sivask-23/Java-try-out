import java.util.LinkedList;

public class LinkedL {
    public static void main(String[] args){
        LinkedList<String> list= new LinkedList<String>();
        list.addFirst("Siva");
        System.out.println(list);
        list.addLast("Kumar");
        System.out.println(list);
        System.out.println("Size of list is " + list.size());
//        to remove

        list.removeLast();
        System.out.println(list);

        list.addLast("kumar");
        list.addLast("S");
        System.out.println(list);

        System.out.println(list.get(1));
        for (int i=0;i<list.size();i++){
            if (list.get(i)=="S")
            {
                System.out.println("found");
                break;
            }
        }
        System.out.println(list.contains("kumar"));
        list.add(1,"Sureshkumar");
        for (String i: list){
            System.out.print(i+"->");
        }
        System.out.println("NULL");


    }
}
