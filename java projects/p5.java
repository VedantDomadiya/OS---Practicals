import java.util.Scanner;

class p5
{
    public static void main(String [] arg)
        {
            Scanner sc = new Scanner(System.in);
            int i,n;
            n = sc.nextInt();
            float [] a = new float[n];
            double total=0.0,ans=0.0;
            for (i=0;i<n;i++)
            {
                System.out.print(i+" number element");
                a[i]= sc.nextFloat();
                total +=a[i];
            }
            ans = total/n;
            System.out.println("Total of "+n+" number is : "+ans);
        }
}