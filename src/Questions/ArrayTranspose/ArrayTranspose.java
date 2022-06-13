package Questions.ArrayTranspose;

import java.util.Arrays;

public class ArrayTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matris = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] transpoze = new int[matris[0].length][matris.length];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				transpoze[j][i] = matris[i][j];
			}
		}

		for (int i = 0; i < transpoze.length; i++) {
			for (int j = 0; j < transpoze[i].length; j++) {
				System.out.print(transpoze[i][j] + " ");
			}
			System.out.println();
		}
	}

}
