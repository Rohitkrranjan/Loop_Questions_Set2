import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        System.out.print("Reverse of digit is : "+reverse_Digit(n));
    }
    public static int reverse_Digit(int num)
    {
        int ans=0;
        while (num>0)
        {
            int digit = num % 10;
            ans=ans*10 + digit;
            num=num/10;

        }
        return ans;
    }
}
