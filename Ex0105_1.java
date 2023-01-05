package hello;

import java.util.Scanner;

public class Ex0105_1 {

	public static void main(String[] args) {
		
		String [] product = {"수박", "딸기", "한라봉"};
		int [] price = {100, 200, 300};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성명을 입력하세요: "); 
		String name = sc.next();
		
		System.out.print("과일을 선택하세요: ");
		int fr = sc.nextInt();

		System.out.print("수량을 선택하세요: ");
		int n = sc.nextInt();
		
		System.out.println(name + " " + product[fr] + " " + n +  " " + n * price[fr]);
	}

}
