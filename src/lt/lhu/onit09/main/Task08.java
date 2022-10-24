package lt.lhu.onit09.main;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		int [][] mas = new int[7][8];
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		int qntt = 0;
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(Math.abs(mas[i][j]) == 7) {
					count++;
				}
			}
		}
		System.out.println(" Quantity of number 7 = " + count);
	}

}
