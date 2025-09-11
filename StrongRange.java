import java.util.Scanner;

public class StrongRange {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Strong numbers between 1 and " + n + ":");
        for (int num = 1; num <= n; num++) {
            int temp = num, sum = 0;
            while (temp > 0) {
                int d = temp % 10;
                sum += factorial(d);
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
