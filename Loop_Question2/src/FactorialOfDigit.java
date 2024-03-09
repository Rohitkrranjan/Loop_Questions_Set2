import java.util.Scanner;

public class FactorialOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
         facttorial_Of_Digit(n);
        System.out.print("Program end here ");
    }
    public static void facttorial_Of_Digit(int num){
        int ans=1;
        while(num > 0)
        {
            int digit = num % 10;
            factorial(digit);
            num=num/10;
        }

    }
    public static void factorial(int x)
    {
        int prod=1;
        for(int i=1;i<=x;i++)
        {
            prod=prod*i;
        }
        System.out.print("Factorial of digit is : "+prod);
        System.out.println();
    }
}
