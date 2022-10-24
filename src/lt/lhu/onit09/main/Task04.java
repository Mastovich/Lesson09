package lt.lhu.onit09.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		int[][] mas = new int[5][9];
		Random rand = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(100);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%4d]", mas[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("First string ---");
		for (int element : mas[0]) {
			System.out.printf("{%4d}", element);
		}
		System.out.println();
		System.out.println("Last string ---");
		for (int element : mas[mas.length - 1]) {
			System.out.printf("{%4d}", element);
		}
		System.out.println();

	}

}
