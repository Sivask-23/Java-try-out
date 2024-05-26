import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {     //12:00:40PM
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String por=s.substring(0,8);
        String [] timear=por.split(":");
        for (int i=0;i<timear.length;i++){
            System.out.print(timear[i]+" ");
        }
    }
}