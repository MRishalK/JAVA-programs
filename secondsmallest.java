import java.util.Scanner;

public class secondsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, temp;
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        int Secondsmallest = a[0];
        for (i = 1; i < n; i++) {
            if (a[i] != a[0]) {
                Secondsmallest = a[i];
                break;
            }
        }
        System.out.println("the second smallest element is " + Secondsmallest);
    }
}