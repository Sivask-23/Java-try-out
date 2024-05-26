//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Qsort {
    public static int partition(int[] c,int lb, int ub){
        int pivot=c[ub]; // taking last elemt as pivot
        int start=lb-1;
        //int end=ub;
        for (int j=lb;j<ub;j++){
            if (c[j]< pivot){
                start++;
                // swap

                int temp=c[start];
                c[start]=c[j];
                c[j]=temp;
            }
        }

        start++;
        int temp=c[start];
        c[start]=pivot;
        c[ub]=temp;
        return start;

    }
    public static void quicksort(int[]c,int lb,int ub){
        if (lb<ub){
            int loc=partition(c,lb,ub);
            quicksort(c,lb,loc-1);
            quicksort(c,loc+1,ub);
        }
    }
    public static void main(String[] args) {
        int [] c= {6,3,9,8,5,9,2,8};
        int si=c.length;
        quicksort(c,0,si-1);
        for (int i: c){
            System.out.print(i+" ");
        }


    }
}