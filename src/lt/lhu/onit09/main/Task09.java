package lt.lhu.onit09.main;

import java.util.Random;

public class Task09 {

	public static void main(String[] args) {
		int [][] mas = new int[7][7];
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
		System.out.println();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if(i == j) {
					System.out.printf("{%4d}", mas[i][j]);
				} else {
					System.out.printf("{ -- }");
				}
			}
			System.out.println();
		}
	}

}
