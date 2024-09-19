import java.util.Scanner;
import java.util.StringTokenizer;

public class tokenizer {
    public static void main(String[] args) {
        String numbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        numbers = sc.nextLine();
        StringTokenizer st = new StringTokenizer(numbers, " ");
        int sum = 0;
        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            System.out.println("number : " + i);
            sum = sum + i;

        }
        System.out.println("sum :" + sum);
    }
}