import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(-2);
        a.add(8);
        a.add(-8);
        a.add(-4);
        int s=a.size();
        int n=0;
        int p=0;
        int z=0;
        for(int i=0;i<a.size();i++){

            int num=a.get(i);
            if(num > 0)
            {
                p++;
            }
            if(num<0)
            {
                n++;
            }
            if(num==0)
            {
                z++;
            }

        }
        DecimalFormat df=new DecimalFormat("#.000000");
        float res=((float) p/(float)s);
        System.out.println(df.format(res));
        float res1=((float)n/(float)s);
        System.out.println(df.format(res1));
        float res2=((float)z/(float)s);
        System.out.println(df.format(res2));

    }
}