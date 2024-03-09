import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = input.nextInt();
        int ans = digit_Sum(n);
        System.out.print("Sum of digits is : " + ans);
    }

    public static int digit_Sum(int num){
        int sum=0;
        while (num>0)
        {
            int digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }
}
