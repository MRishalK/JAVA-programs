import java.util.Scanner;

class revstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, rev = "";
        System.out.println("Enter your string:");
        str = sc.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string is:" + rev);
    }
}
