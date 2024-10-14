package operator;

public class Ex01 {
	public static void main(String[] args) {
		int n1 = 9, n2 = 2;
		System.out.println(n1 / n2);
		System.out.println(n1 / (double)n2);
		System.out.println(n1 % n2);
		
		System.out.println("---복합대입연산자---");
		n1 = n2 = 5;
		n1 += 1;
		System.out.println(n1);
		n1 -= 1;
		System.out.println(n1);
		n1 *= n2;
		System.out.println(n1);
		n1 /= n2;
		System.out.println(n1);
		n1 %= n2;
		System.out.println(n1);
		
		System.out.println("---관계연산자---");
		n1 = 5;
		n2 = 4;
		System.out.println(n1 > n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		boolean bool;
		bool=n1 > n2;
		System.out.println(bool);
		bool=n1 < n2;
		System.out.println("result : " + bool);
		
		System.out.println("---논리연산자---");
		int n3 = 10;
		n1 = 5; n2 = 7;
		System.out.println(n1 > n2);
		System.out.println(n1 > n3);
		System.out.println(n1 > n2 && n1 > n3);
		System.out.println(n2 > n1 && n2 > n3);
		System.out.println(n3 > n1 && n3 > n2);
		
		System.out.println("--- or ---");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("--- and ---");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("--- not ---");
		System.out.println(! true);
		System.out.println(! false);
		System.out.println(! (10 > 20));
		System.out.println("---예제---");
		n1 = 10; n2 = 5;
		bool = n1 > n2 && n1 % n2 == 0;
		System.out.println(bool);
		
		System.out.println("--- 증감연산자 ---");
		n1 = 5;
		++n1;
		System.out.println("n1 : " + n1);
		n2 = 5;
		n2++;
		System.out.println("n2 : " + n2);
		System.out.println("----------");
		n1 = 10;
		n2 = ++n1;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("----------");
		n1 = 10;
		n2 = n1++;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		int a = 5, b = 6, c = 10, d;
		d = ++a * b--;
		System.out.println(a + "," + b + "," + d);
		d=a++ + ++c - b--;
		System.out.println(a + "," + b + "," + c + "," + d);
		
		System.out.println("---조건연산자---");
		n1 = 30; n2 = 20;
		String result;
		result = (n1 > n2) ? "n1이 n2보다 크다" : "n2가 n1보다 크다";
		System.out.println(result);
	}
}