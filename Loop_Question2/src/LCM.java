import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease enter first digit : ");
        int a = input.nextInt();
        System.out.print("Please enter second digit : ");
        int b = input.nextInt();
        int ans = lcm(a,b);
        System.out.print("LCM of "+ a +" and "+b +" is : "+ans);
    }
    public static int lcm(int x,int y)
    {
        int abtakKaHcf=0;
        int Lcm=0;
        int min=x<y?x:y;
        for(int i=1;i<=min;i++)
        {
            if(x%i==0 && y%i==0)
            {
                abtakKaHcf = i;
                Lcm = x*y/abtakKaHcf;
            }
        }
        return Lcm;
    }
}
