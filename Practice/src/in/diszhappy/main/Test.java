package in.diszhappy.main;

//This is a sample program to solve the linear equations.
import java.util.Scanner;

import in.diszhappy.matrix.util.MatrixUtil;

public class Test {
	public static void main(String args[]) {
		char[] var = { 'x', 'y', 'z', 'w' };
		System.out.println("Enter the number of variables in the equations: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Enter the coefficients of each variable for each equations");
		System.out.println("a b c d e");
		double[][] mat = new double[n][n];
		double[][] constants = new double[n][1];
		// input
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = input.nextDouble();
			}
			constants[i][0] = input.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + mat[i][j]);
			}
			System.out.print("  " + var[i]);
			System.out.print("  =  " + constants[i][0]);
			System.out.println();
		}
		double inverted_mat[][] = MatrixUtil.invert(mat);
		System.out.println("The inverse is: ");
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.print(inverted_mat[i][j] + "  ");
			}
			System.out.println();
		}
		// Multiplication of mat inverse and constants
		double result[][] = new double[n][1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 1; j++) {
				for (int k = 0; k < n; k++) {
					result[i][j] = result[i][j] + inverted_mat[i][k] * constants[k][j];
				}
			}
		}
		System.out.println("The variables are :");
		for (int i = 0; i < n; i++) {
			System.out.print(result[i][0] + " ");
		}
		input.close();

	}

}