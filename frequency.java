import java.util.Scanner;

class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        System.out.println("Enter the frequency character to find:");
        char ch = sc.next().charAt(0);
        int frequency = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }
        System.out.println("The frequecncy of the character " + ch + " in the string " + str + " is " + frequency);
    }
}