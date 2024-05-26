public class newmer {
    public static void msort(int[] b,int lb, int middle, int ub){
        int[] newar = new int[ub-lb+1];
        int indexi=lb;
        int index2=middle+1;
        int x=0;

        while (indexi<=middle && index2<=ub){
            if (b[indexi] <= b[index2]){
                newar[x++]=b[indexi++];
            }else {
                newar[x++]=b[index2++];
            }
        }

        while (indexi <= middle){
            newar[x++]=b[indexi++];
        }
        while (index2 <= ub){
            newar[x++]=b[index2++];
        }

        for (int i=0,j=lb;i<newar.length;i++,j++){
            b[j]=newar[i];
        }

    }
    public static void merge(int[] b,int lb, int ub){

        if (lb<ub){
            int middle=lb+(ub-lb)/2;
            merge(b,lb,middle);
            merge(b,middle+1,ub);
            msort(b,lb,middle,ub);
        }

    }
    public static void main(String[] args){
        int[] b= {10,5,35,12,67,84,23,85,90,67};
        int size=b.length;
        merge(b,0,size-1);
       for (int i: b){
           System.out.print(i+" ");
       }
    }
}
