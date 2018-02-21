package prob03;

import java.util.Scanner;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		CurrencyConverter.setRate(1076);

		System.out.println("원화를 입력해주세요.");
		double won = scan.nextInt();
		double dollar = CurrencyConverter.toDollar(won);
		
		System.out.println(won+"원은 "+dollar+"달러입니다.");
		
		System.out.println("달러를 입력해주세요.");
		dollar = scan.nextInt();
		won = CurrencyConverter.toKRW(dollar);
		
		System.out.println(dollar+"달러는 "+won+"원입니다.");
	}

}
