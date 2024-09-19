import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count = i;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Given number is prime number");
        } else {
            System.out.println("Given number is not prime number");
        }
    }
}