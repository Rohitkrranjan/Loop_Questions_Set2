import java.util.Scanner;

public class SumOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = input.nextInt();
        int ans = sumOfCubeOfNumber(n);
        System.out.print("Sum of cube of number is : " + ans);
    }
    public static int sumOfCubeOfNumber(int num){
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            sum = sum + (i*i*i);
        }
        return sum;
    }
}
