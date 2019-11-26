package Java_20191126;

public class CallByRefDemo {
	public static void change(int i, int[] j){ // int i = a, int[] j = b
		i = 20;
		j[3] = 400;
	}
	public static void main(String[] args) {
		int a = 10;
		int b[] = {1, 2, 3, 4};
		
		System.out.println(a);
		System.out.println(b[3]);
		
		// a => call by value, b => call by reference
		CallByRefDemo.change(a, b); 
//		change(a, b); // 같은 class내에서는 class명 생략가능
		
		System.out.println(a); // call by value 메서드 호출후 변화 없음
		System.out.println(b[3]); // call by reference 메서드 호출후 변화 있음
		
		// 지역변수 <= 접근한정자를 붙일 수 없음
		//초기화를 안해도 상관없지만 연산이나 기타 작업을 할 수 없음
		int[] c; 
//		System.out.println(c); // 메모리 할당이 되지 않았기 때문에 오류
		c = new int[4];
		
		int[] d = null; // 메모리 할당 됨
		System.out.println(d);
		d = new int[4];
		
		int age;
//		int t = age + 20; // 메모리할당이 되지 않은 상태에서는 불가능
		age = 10;
	}
}
