import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, digits = 0;

        int copy = num;
        while (copy > 0) {
            digits++;
            copy /= 10;
        }

        copy = num;
        while (copy > 0) {
            int d = copy % 10;
            sum += Math.pow(d, digits);
            copy /= 10;
        }

        if (sum == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
