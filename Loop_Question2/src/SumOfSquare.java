import java.util.Scanner;

public class SumOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = input.nextInt();

        int ans = sumOfSquareNumber(n);
        System.out.print("Sum of square of number is : "+ans);
    }

    public static int sumOfSquareNumber(int num){
        int sum=0;
        for(int i=0;i<=num ;i++)
            sum = sum + i*i;
        return sum;
    }
}
