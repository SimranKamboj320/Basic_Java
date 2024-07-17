import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 2) {
            System.out.println("Number is prime");
        } else {
            boolean Prime = true;
            for (int i = 2; i<=Math.sqrt(num); i++) {
                if (num % i == 0) {
                    Prime = false;
                    break;  // Adding break to improve efficiency
                }
            }
            if (Prime) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }
    }
}