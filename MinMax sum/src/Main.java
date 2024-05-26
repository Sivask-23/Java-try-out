import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] ar=new int[5];
        ar[0]=18;
        ar[1]=11;
        ar[2]=12;
        ar[3]=13;
        ar[4]=10;
        int sum=0,min=0,max=0;
       for(int i=0;i<ar.length;i++){
           sum+=ar[i];
           if (ar[i]>max){
               max=ar[i];
           };
           if(ar[i]<max){
               min=ar[i];
           }
       }
        System.out.println((sum-max)+" "+(sum-min));
       Arrays.sort(ar);



    }
}