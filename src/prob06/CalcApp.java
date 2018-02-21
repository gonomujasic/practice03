package prob06;

import java.util.Scanner;

public class CalcApp {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calculator cal = null;
		
		
		while( true ) {
			System.out.println("식을 입력해주세요.");
			String str = scanner.nextLine();
			
			if(str.equals("quit"))
				break;
			
			String[] strArr =str.split(" ");
						
			if(strArr[1].equals("+")) {
				cal = new Add();
				System.out.println(cal.calc(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[2])));
				cal = null;
			} else if(strArr[1].equals("-")) {
				cal = new Sub();
				System.out.println(cal.calc(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[2])));
				cal = null;
			} else if(strArr[1].equals("*")) {
				cal = new Mul();
				System.out.println(cal.calc(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[2])));
				cal = null;
			} else if(strArr[1].equals("/")) {
				cal = new Div();
				System.out.println(cal.calc(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[2])));
				cal = null;
			} 
		}
		
		scanner.close();

	}

}
