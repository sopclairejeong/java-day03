package if_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = sc.nextInt();
		if(num % 12 == 0 && num != 0) {
			System.out.println("3의 배수이면서, 4의 배수에도 해당합니다");
		}else if(num % 3 == 0 && num != 0) {
			System.out.println("3의 배수에만 해당합니다");
		}else if(num % 4 == 0 && num != 0) {
			System.out.println("4의 배수에만 해당합니다");
		}else if(num % 3 != 0 && num % 4 != 0) {
			System.out.println("3의 배수도, 4의 배수도 아닙니다");
		}else {
			System.out.println("0은 잘못 입력했습니다");
		}
		
		/*
		if(num == 0) {
			System.out.println("0은 잘못 입력했습니다");
		}else if(num % 12 == 0) {
			System.out.println("3의 배수이면서, 4의 배수에도 해당합니다");
		}else if(num % 3 == 0) {
			System.out.println("3의 배수에만 해당합니다");
		}else if(num % 4 == 0) {
			System.out.println("4의 배수에만 해당합니다");
		}else if(num % 3 != 0 || num % 4 != 0) {
			System.out.println("3의 배수도, 4의 배수도 아닙니다");
		*/
		}
	}