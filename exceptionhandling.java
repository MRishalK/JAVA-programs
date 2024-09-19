import java.util.Scanner;

public class exceptionhandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Entr your age:");
        age = sc.nextInt();
        try {
            if (age < 18) {
                throw new Exception("Under age");
            } else {
                System.out.println("welcome for voting....");
            }
        } catch (Exception e) {
            System.out.println("Not eligible for voting...");
            e.printStackTrace();
        } finally {
            System.out.println("Minimum required age for voting is 18!...");
        }
    }
}