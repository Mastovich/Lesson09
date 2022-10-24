package lt.lhu.onit09.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		int [][] mas = new int[5][5];
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(15);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int j = 1; j < mas[0].length; j = j + 2) {
			if (mas[0][j] > mas[mas.length - 1][j]) {
				for (int f = 0; f < mas.length; f++) {
					System.out.printf("{%4d}\n", mas[f][j]);
				}
				System.out.println();
			}
			
		}
		

	}

}
