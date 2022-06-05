package MyLessons.Lesson15;

public class Matrix {

    private double[][] matrix;
    private int rowsQuantity;
    private int columnsQuantity;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.rowsQuantity = this.matrix.length;
        this.columnsQuantity = this.matrix[0].length;
    }

    public Matrix() {
    }

   static Matrix summMatrix(Matrix matrixA, Matrix matrixB){
       double[][] a = matrixA.matrix;
       double[][] b = matrixB.matrix;
       Matrix c = new Matrix(new double[matrixA.rowsQuantity][matrixB.columnsQuantity]);
       for(int i = 0; i < c.rowsQuantity; i++) {
           for(int j = 0; j < c.columnsQuantity; j++) {
               c.matrix[i][j] = a[i][j] + b[i][j];
           }
       }

       return c;
   }

    static Matrix multyMatrix(Matrix matrix, int x) {
        double[][] z = matrix.matrix;
        Matrix c = new Matrix(new double[matrix.rowsQuantity][matrix.columnsQuantity]);
        for(int i = 0; i < c.rowsQuantity; i++) {
            for(int j = 0; j < c.columnsQuantity; j++) {
                c.matrix[i][j] = z[i][j] *x;
            }
        }
        return c;
    }

    static Matrix multyMatrix(Matrix matrixA, Matrix matrixB){
        double[][] a = matrixA.matrix;
        double[][] b = matrixB.matrix;
        Matrix c = new Matrix(new double[matrixA.rowsQuantity][matrixB.columnsQuantity]);
        for(int i = 0; i < c.rowsQuantity; i++) {
            for(int j = 0; j < c.columnsQuantity; j++) {
                c.matrix[i][j] = a[i][j] * b[i][j];
            }
        }

        return c;
    }

    public void print(){
        for (double[] first : this.matrix) {
            for (double second : first) {
                System.out.print(second + " ");
            }
            System.out.println();
        }
    }
}
