package level_3;

import java.util.Random;

public class AdvancedMatrixOperations {
    public static double[][] createRandomDoubleMatrix(int size) {
        Random rand = new Random();
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextDouble() * 10; // Values 0.0-10.0
            }
        }
        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])
                - matrix[0][1] * (matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])
                + matrix[0][2] * (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
    }

    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) return null;

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;

        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] matrix2x2 = createRandomDoubleMatrix(2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix2x2));

        System.out.println("\nDeterminant: " + determinant2x2(matrix2x2));

        System.out.println("\nInverse:");
        double[][] inverse = inverse2x2(matrix2x2);
        if (inverse != null) {
            displayMatrix(inverse);
        } else {
            System.out.println("Matrix is not invertible (determinant = 0)");
        }
    }
}