import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to chech whether its palindrome or not:");
        String str = sc.nextLine();
        boolean ispalindrome = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                ispalindrome = false;
                break;
            }

        }
        if (ispalindrome) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " not palindrome");
        }
    }

}
