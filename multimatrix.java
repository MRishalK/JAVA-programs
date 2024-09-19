import java.util.Scanner;

public class multimatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m1;
        int[][] m2;
        System.out.println("enter the dimensions od first matrix(row,column):");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        m1 = new int[r1][c1];
        System.out.println("Enter the elements to the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the dimensions od second matrix(row,column):");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        m2 = new int[r2][c2];
        System.out.println("Enter the elements to the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("Invalid multiplication,matrix multiplication not possible!......");
            return;
        }
        int[][] productmatrix = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++) {
                    productmatrix[i][j] = m1[i][k] * m2[k][j];
                }
        System.out.println("product matrix is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(productmatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
