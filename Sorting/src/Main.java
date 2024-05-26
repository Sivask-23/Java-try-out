import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements to array");
        // to get elements
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // to print array elements
        System.out.print("Array elements are: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        // to sort
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j =i+1;j< arr.length;j++){
                if (arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting:");
        for (int j: arr){
            System.out.print(j+ " ");
        }
    }
}