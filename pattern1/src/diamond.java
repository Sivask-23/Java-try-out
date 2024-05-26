import java.util.Scanner;

public class diamond {
    static void method1(int r)
    {
        int n=r;
        for(int i=1; i<=n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for (int j=2; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n; i>=1; i--)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for (int j=2; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    static void method2(int r)
    {
        int n=r;
        for(int i=1; i<=n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<= (2*i)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n; i>=1; i--)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<= (2*i)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        while (true)
        {
            System.out.println("___diamond print methods___");
            System.out.println("Enter range of diamond");
            int range=sc.nextInt();
            System.out.println("Press 1 for method 1");
            System.out.println("Press 2 for method 2");
            System.out.println("Press 3 to STOP");
            int choice;
            choice= sc.nextInt();
            switch (choice)
            {
                case 1: method1(range);break;
                case 2: method2(range);break;
                case 3: return;
                default:
                    System.out.println("Enter valid key");

            }
        }


    }
}

