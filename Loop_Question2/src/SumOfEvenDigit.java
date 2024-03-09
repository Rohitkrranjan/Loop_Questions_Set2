import java.util.Scanner;

public class SumOfEvenDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        int ans = even_Digit_Sum(n);
        System.out.print("Sum of even digit is  : "+ ans);
    }
    public static int even_Digit_Sum(int num)
    {
        int sum=0;
        while(num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sum = sum + digit;
            }
            num = num / 10;
        }
        return sum;
    }

}
