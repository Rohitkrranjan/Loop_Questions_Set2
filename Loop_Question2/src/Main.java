import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++)
        {
           sum = sum+i;
        }
        System.out.print("Sum of "+n+" natural number is : "+sum);
    }
}