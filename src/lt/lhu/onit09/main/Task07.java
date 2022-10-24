package lt.lhu.onit09.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		int [][] mas = new int[5][5];
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
				if(rand.nextInt(50) % 3 == 0) {
					mas[i][j] = -mas[i][j];
				}
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		
		int summ = 0;
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (Math.abs(mas[i][j]) % 2 == 1 && mas[i][j] < 0) {
					summ += mas[i][j];
				}
			}
		}
		System.out.println(" Summ = " + summ);
	}

}
