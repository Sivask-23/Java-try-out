//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class newsort {
    public static int partition(int[] c,int lb, int ub){
        int pivot=c[lb];
        int start=lb;
        int end=ub;
        while (start<end){
            if (c[start] < pivot){
                start++;
            }
            if (c[end] > pivot){
                end--;
            }
            if(start < end){
                int temp=c[start];
                c[start]=c[end];
                c[end]=temp;
            }
        }
        if (start > end){
            int temp=c[end];
            c[end]=pivot;
            c[lb]=temp;
        }
        return end;

    }
    public static void quicksort(int[]c,int lb,int ub){
        if (lb<ub){
            int loc=partition(c,lb,ub);
            quicksort(c,lb,loc-1);
            quicksort(c,loc+1,ub);
        }
    }
    public static void main(String[] args) {
        int [] c= {6,3,9,5,2,8};
        int si=c.length;
        quicksort(c,0,si-1);
        for (int i: c){
            System.out.print(i+" ");
        }


    }
}