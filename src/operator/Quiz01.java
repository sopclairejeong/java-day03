package operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num;
		num = input.nextInt();
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num + " : " + result);
		result = (num % 3 == 0) ? "3의 배수" : "3의 배수 아님";
		System.out.println(num + " : " + result);
		System.out.println("--------------------");
		System.out.print("두 수 입력 : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		result = (num1 > num2) ? "num1이 num2보다 크다" : "num2가 num1보다 크다";
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		System.out.println(result);
	}
}