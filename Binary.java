import java.util.Scanner;

class Binary {
    public static int binarysearch(int a[], int lb, int ub, int key) {
        int index = -1;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (a[mid] == key) {
                index = mid;
                break;
            } else if (a[mid] > key) {
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        sc.nextLine();
        int a[] = new int[n];
        System.out.println("Enter the sorted array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("elements to be searched:");
        int key = sc.nextInt();
        sc.nextLine();

        int res = binarysearch(a, 0, n - 1, key);
        if (res == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at " + res);
        }
    }
}
