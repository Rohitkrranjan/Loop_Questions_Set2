import java.util.Scanner;

public class Sum_Of_All_Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n=input.nextInt();

        int ans = factorSum(n);
        System.out.print("Sum of all the factors is : "+ ans);
    }
    public static int factorSum(int num){
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        return sum;
    }
}
