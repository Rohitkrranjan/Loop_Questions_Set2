import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first digit : ");
        int a = input.nextInt();
        System.out.print("Please enter second digit : ");
        int b = input.nextInt();

        int ans = hcf(a,b);
        System.out.print("HCF of "+ a +" and "+b +" is : "+ans);
    }

    public static int hcf(int x,int y)
    {
        int min = x<y?x:y;
        int abtakKaHCF =0;
        for(int i=1;i<=min;i++)
        {
            if(x%i==0 && y%i==0)
            {
                abtakKaHCF=i;
            }
        }
        return abtakKaHCF;
    }
}
