import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int n = input.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.print(n + "x" + i+ "=" +n*i);
            System.out.println();
        }

    }
}
