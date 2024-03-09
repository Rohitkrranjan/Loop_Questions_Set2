//import java.util.Scanner;
//
//public class Neon_Number {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter a number : ");
//        int n = input.nextInt();
//        boolean ans = checkNeonNumber(n);
//        if(ans)
//        System.out.print("Neon number");
//        else
//            System.out.print("Not a neon number ");
//    }
//    public static boolean checkNeonNumber(int num)
//    {
//        int sum=0;
//        while(num >0)
//        {
//            int digit = num % 10;
//            num = num /10;
//            sum =sum + squareOfDigit(digit);
//        }
//        if(sum == num)
//            return true;
//        else
//            return false;
//    }
//
//    public static int squareOfDigit(int m)
//    {
//        int prod=1;
//        for(int i=1;i<=m;i++)
//        {
//            prod= prod*i;
//        }
//        return prod;
//}
//}
