import java.util.Scanner;

public class PrefectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = input.nextInt();

        boolean ans = checkPrefectNumber(n);
        if(ans)
        {
            System.out.print("Given number is prefect number ");
        }
        else
        {
            System.out.print("given number is not a prefect number");
        }
    }
    public static boolean checkPrefectNumber(int num){
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num % i==0)
            {
                sum = sum+i;
            }
            if(sum == num)
                return true;

        }
        return false;
    }

}
