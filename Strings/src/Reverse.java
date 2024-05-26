import java.util.Scanner;

public class Reverse {
    public static StringBuilder  rev(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i <sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        //String st=sb.toString();
        return sb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String str = sc.nextLine();
        //System.out.println(rev(str));
        //String ok=;
        //System.out.println(ok);
        if (str.equals(rev(str).toString()))
        {
            System.out.println("palindrome strings");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}