package lt.lhu.onit09.main;

public class Task01 {

	public static void main(String[] args) {
		int[][] mas = new int[3][4];
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 2; j < mas[i].length; j++) {
				mas[i][j] = j - 2;
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d ", mas[i][j]);
			}
			
		System.out.println();
		}
		
	System.out.println();
	}

}
