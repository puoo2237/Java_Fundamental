package java_20191119;

public class OperatorDemo {
	public static void main(String[] args){
		int a = 7, b = 20;
		int c = 0;
		double d = 0;
		
		c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
//		소수점 이하 double로 casting하여 표현하기
//		산술연산자의 특징: 한쪽이 변하면 다른 한쪽도 변하는 특징이 있음
//		d = (double)b / (double)a;
//		d = (double)b / a;
		d = b / (double)a;
		System.out.println(d);
		
		c = b % a;
		System.out.println(c);
		
		a += b; // a = a + b;
		
		int sum = 0;
		for(int i = 0; i <= 100; i++){
			sum += i;
		}
		System.out.println(sum);
		
//		a = a + 1
		a++;
		++a;
		
		
		a = 20;
//		증가 후 대입
		c = ++a;
		System.out.println(c);
		
//		대입 후 증가
		c = a++;
		System.out.println(c);
		
		a = 10;
		b = 20;
		
		boolean isSuccess = false;
		isSuccess = a>b;
		System.out.println(isSuccess);
		
		isSuccess = a<b;
		System.out.println(isSuccess);
		
		isSuccess = a>=b;
		System.out.println(isSuccess);
		
		isSuccess = a<=b;
		System.out.println(isSuccess);

		isSuccess = a==b;
		System.out.println(isSuccess);

		isSuccess = a!=b;
		System.out.println(isSuccess);
		
//      a && b => a 가 false 이면 b 연산을 하지 않음(short circuit)
//		a || b => a 가 true 이면 b 연산을 하지 않음(short circuit)
		isSuccess = (a == b) && (++a == ++b);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);

		System.out.println(1 + 2 + 3 + 4 + "5");
		System.out.println("1" + 2 + 3 + 4 + 5);
		System.out.println(1 + 2 + "3" + 4 + 5);


	}
}
