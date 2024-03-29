package java_20191119;

public class CastingDemo {
	public static void main(String[] args){
		// overflow 발생하여 compile error 발생
		// byte b1 = 250;
		
		// 이런 경우 원하지 않는 값이 출력될 수 있음 
		byte b1 = (byte) 128; // circuit 발생, 권장하지 않음
		System.out.println(b1);
		
		int i1 = (int) 123.35; // cut 발생
		System.out.println(i1);
		
		double d1 = 124.5f; // auto casting
		System.out.println(d1);
		
		byte b2 = 10;
		byte b3 = 20;
		
		// 산술연산자는 반환값이 int이기 때문에 전체를 byte로 
		// casting 해야 에러가 발생하지 않음
		byte b4 = (byte)(b2 + b3);
		System.out.println(b4);
	
		int a1 = 10_000_000; // 1000 단위로 _를 넣어주면 보기 편함
		System.out.println(a1);
		
		// 결론: casting은 cut의 목적이 아닌 circuit의 목적으로는 사용하지 말자!
	}
}
