public class ReversePrimeCheck {
    public static void main(String[] args) {
        int id = 1027;   
        int last4 = id % 10000;   
        int rev = 0, temp = last4;

        
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Last 4 digits: " + last4);
        System.out.println("Reversed number: " + rev);

        
        boolean isPrime = true;
        if (rev <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= rev / 2; i++) {
                if (rev % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(rev + " is a Prime number.");
        } else {
            System.out.println(rev + " is NOT a Prime number.");
        }
    }
}
