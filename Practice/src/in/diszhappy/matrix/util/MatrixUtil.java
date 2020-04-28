/**
 * 
 */
package in.diszhappy.matrix.util;

/**
 * @author saumm
 *
 */
public class MatrixUtil {

	/**
	 * Method to add two n*n matrices
	 * @param a
	 * @param b
	 * @return
	 */
	public static double[][] add(double a[][], double b[][]) {
		int n = a.length;

		// creating another matrix to store the sum of two matrices
		double c[][] = new double[n][n]; 

		// adding and printing addition of 2 matrices
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				c[i][j] = a[i][j] + b[i][j]; // use - for subtraction
			}
		}
		return c;
	}
	/**
	 * Method to find transpose of a matrix
	 * @param original
	 * @return
	 */
	public static double[][] transpose(double original[][]) {
		int n = original.length;
		double transpose[][] = new double[n][n];

		// Code to transpose a matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				transpose[i][j] = original[j][i];
			}
		}
		return transpose;
	}
	/**
	 * Method to find multiplication of two matrices
	 * @param a
	 * @param b
	 * @return
	 */
	public static double[][] multiply(double a[][], double b[][]) {
		int row1, col1, row2, col2;
		// Calculates number of rows and columns present in first matrix
		row1 = a.length;
		col1 = a[0].length;

		// Calculates the number of rows and columns present in the second matrix

		row2 = b.length;
		col2 = b[0].length;

		// For two matrices to be multiplied,
		// number of columns in first matrix must be equal to number of rows in second
		// matrix
		if (col1 != row2) {
			System.out.println("Matrices cannot be multiplied");
			return null;
		}

		// Array prod will hold the result
		double prod[][] = new double[row1][col2];

		// Performs product of matrices a and b. Store the result in matrix prod
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for (int k = 0; k < row2; k++) {
					prod[i][j] = prod[i][j] + a[i][k] * b[k][j];
				}
			}

		}
		return prod;
	}
	
	/**
	 * Method to find inverse of a matrix
	 * @param a
	 * @return
	 */
	public static double[][] invert(double a[][]) {
		int n = a.length;
		double x[][] = new double[n][n];
		double b[][] = new double[n][n];
		int index[] = new int[n];
		for (int i = 0; i < n; ++i)
			b[i][i] = 1;

		// Transform the matrix into an upper triangle
		gaussian(a, index);

		// Update the matrix b[i][j] with the ratios stored
		for (int i = 0; i < n - 1; ++i)
			for (int j = i + 1; j < n; ++j)
				for (int k = 0; k < n; ++k)
					b[index[j]][k] -= a[index[j]][i] * b[index[i]][k];

		// Perform backward substitutions
		for (int i = 0; i < n; ++i) {
			x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
			for (int j = n - 2; j >= 0; --j) {
				x[j][i] = b[index[j]][i];
				for (int k = j + 1; k < n; ++k) {
					x[j][i] -= a[index[j]][k] * x[k][i];
				}
				x[j][i] /= a[index[j]][j];
			}
		}
		return x;
	}

	/**
	 * Method to carry out the partial-pivoting Gaussian elimination. Here index[] stores pivoting order.
	 * @param a 
	 * @param index
	 */

	public static void gaussian(double a[][], int index[]) {
		int n = index.length;
		double c[] = new double[n];

		// Initialize the index
		for (int i = 0; i < n; ++i)
			index[i] = i;

		// Find the rescaling factors, one from each row
		for (int i = 0; i < n; ++i) {
			double c1 = 0;
			for (int j = 0; j < n; ++j) {
				double c0 = Math.abs(a[i][j]);
				if (c0 > c1)
					c1 = c0;
			}
			c[i] = c1;
		}

		// Search the pivoting element from each column
		int k = 0;
		for (int j = 0; j < n - 1; ++j) {
			double pi1 = 0;
			for (int i = j; i < n; ++i) {
				double pi0 = Math.abs(a[index[i]][j]);
				pi0 /= c[index[i]];
				if (pi0 > pi1) {
					pi1 = pi0;
					k = i;
				}
			}

			// Interchange rows according to the pivoting order
			int itmp = index[j];
			index[j] = index[k];
			index[k] = itmp;
			for (int i = j + 1; i < n; ++i) {
				double pj = a[index[i]][j] / a[index[j]][j];

				// Record pivoting ratios below the diagonal
				a[index[i]][j] = pj;

				// Modify other elements accordingly
				for (int l = j + 1; l < n; ++l)
					a[index[i]][l] -= pj * a[index[j]][l];
			}
		}
	}
	
}
