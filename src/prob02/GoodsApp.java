package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		for(int i = 0; i < COUNT_GOODS; i++) {
			System.out.println("goods를 입력하세요.");
			String[] arr= scanner.nextLine().split(" ");
			
			goods[i]= new Goods(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));
			
		}
		
		for(int k = 0; k <COUNT_GOODS; k++) {
			goods[k].show();
		}
				
		scanner.close();
	}
}
