public class MatrixAddition {
    public static int[][] addMatrices(int[][] A, int[][] B) {
        if (A.length !=B.length||A[0].length !=B[0].length) {
            return null;
        }
        int n = A.length;
        int m = A[0].length;
        int[][] C = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][] A=
                {
                {3, 5, 8},
                {33, 3, 6},
                {1, 2, 9}
        };

        int[][] B={
                {33, 12, 5},
                {31, 23, 3},
                {59, 22, 11}
        };
         int[][] C=addMatrices(A, B);
        if (C !=null) {
             System.out.println("Matrix C (A + B):");
            printMatrix(C);
        } else
        {
              System.out.println("Matrix dimensions are not compatible for addition.");
        }
    }

}