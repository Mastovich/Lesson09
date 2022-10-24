package lt.lhu.onit09.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		int k = 3;
		int p = 4;
		
		int [][] mas = new int[7][8];
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(50);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(i == k) {
					System.out.printf("[%4d]", mas[i][j]);
				} else {
					if(j == p) {
						System.out.printf("[%4d]", mas[i][j]);
					} else {
						System.out.printf("[-00-]", mas[i][j]);
					}
				}
				
			}
			System.out.println();
		}
		
	}

}
