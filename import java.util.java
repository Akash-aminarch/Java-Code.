import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        double sum = 0.0;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += (double) i / fact;
        }

        System.out.println("Sum of the series = " + sum);
    }
}
