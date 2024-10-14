package if_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coffee = 0, money = 0;
		System.out.println("커피 개수 입력");
		coffee = sc.nextInt();
		
		if(coffee > 10) {
			money = 20000 + (coffee - 10) * 1500;
		}else {
			money = coffee * 2000;
		}
		System.out.println(coffee + " : " + money);
	}
}