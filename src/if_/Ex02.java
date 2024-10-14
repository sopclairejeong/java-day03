package if_;

public class Ex02 {
	public static void main(String[] args) {
		int num;
		num = 15;
		if(num > 20) {
			System.out.println(num + " : 10보다 크다");
			System.out.println("1.다음 문장 실행");
			System.out.println("2.다음 문장 실행");
			System.out.println("3.다음 문장 실행");
		}
		System.out.println("4.다음 문장 실행");
		if(num % 2 == 0) {
			System.out.println(num + " : 짝수");
			System.out.println(num + " : 2의 배수");
		}
		System.out.println("5.다음 문장 실행");
		
		if(num % 2 != 0) {
			System.out.println(num + " : 홀수");
		}
		System.out.println("6.다음 문장 실행");
		}
	}