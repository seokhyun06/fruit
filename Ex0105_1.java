package hello;

import java.util.Scanner;

public class Ex0105_1 {

	public static void main(String[] args) {
		
		String [] product = {"����", "����", "�Ѷ��"};
		int [] price = {100, 200, 300};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: "); 
		String name = sc.next();
		
		System.out.print("������ �����ϼ���: ");
		int fr = sc.nextInt();

		System.out.print("������ �����ϼ���: ");
		int n = sc.nextInt();
		
		System.out.println(name + " " + product[fr] + " " + n +  " " + n * price[fr]);
	}

}
