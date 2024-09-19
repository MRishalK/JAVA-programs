import java.util.Scanner;;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int row = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[row][columns];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] transposedmatrix = new int[columns][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                transposedmatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transposedmatrix[i][j] + "");
                ;
            }
            System.out.println();
        }
    }
}