package MyLessons.Lesson26.Task7;


public class Matrix<T> {
    private T[][] matrix;
    private int rowsQuantity;
    private int columnsQuantity;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
        this.rowsQuantity = this.matrix.length;
        this.columnsQuantity = this.matrix[0].length;
    }

    public Matrix() {
    }

    static Matrix summMatrix(Matrix matrixA, Matrix matrixB) {
        Double[][] a = (Double[][]) matrixA.matrix;
        Double[][] b = (Double[][]) matrixB.matrix;
        Matrix<Double> c = new Matrix<>(new Double[matrixA.rowsQuantity][matrixB.columnsQuantity]);
        for (int i = 0; i < c.rowsQuantity; i++) {
            for (int j = 0; j < c.columnsQuantity; j++) {
                c.matrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    static Matrix multyMatrix(Matrix matrix, int x) {
        Double[][] z = (Double[][]) matrix.matrix;
        Matrix c = new Matrix(new Double[matrix.rowsQuantity][matrix.columnsQuantity]);
        for (int i = 0; i < c.rowsQuantity; i++) {
            for (int j = 0; j < c.columnsQuantity; j++) {
                c.matrix[i][j] = z[i][j] * x;
            }
        }
        return c;
    }

    static Matrix multyMatrix(Matrix matrixA, Matrix matrixB) {
        Double[][] a = (Double[][]) matrixA.matrix;
        Double[][] b = (Double[][]) matrixB.matrix;
        Matrix c = new Matrix(new Double[matrixA.rowsQuantity][matrixB.columnsQuantity]);
        for (int i = 0; i < c.rowsQuantity; i++) {
            for (int j = 0; j < c.columnsQuantity; j++) {
                c.matrix[i][j] = a[i][j] * b[i][j];
            }
        }

        return c;
    }

    public void print() {
        for (T[] first : this.matrix) {
            for (T second : first) {
                System.out.print(second + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Matrix<Double> matrix1 = new Matrix<>(new Double[][]{{1.0, 2.0}, {3.0, 4.0}});
        Matrix<Double> matrix2 = new Matrix<>(new Double[][]{{5.0, 6.0}, {7.0, 8.0}});
        System.out.println("-------Матрица 1--------");
        matrix1.print();
        System.out.println("-------Матрица 2--------");
        matrix2.print();
        System.out.println("Сумма матриц 1 и 2:");
        Matrix.summMatrix(matrix1, matrix2).print();
        System.out.println("Умножение Матрицы 1 на число  3");
        Matrix.multyMatrix(matrix1, 3).print();
        System.out.println("Умножение Матрицы 1 на Матрицу 2");
        Matrix.multyMatrix(matrix1, matrix2).print();
    }
}
