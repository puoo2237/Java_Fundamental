package java_20191121;

public class ArrayDemo {
	public static void main(String[] args){
		
		// 1. 배열 선언
		int[] a = new int[4];
		
		// 2. 배열 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;

		// 3. 배열의 출력(index와 값을 알고 싶을 때)
		for(int i = 0; i < a.length; i++){ // length: 배열의 길이, length(): 문자열의 길이
			System.out.println(a[i]);
		}
		
		
		
		// 배열 생성과 할당을 동시에 설정
		int[] b = {1, 2, 3, 4};  // int[] c = new int[]{1, 2, 3, 4};
		
		// 배열의 값 변경(재할당)
		b[0] = 100;
		b[1] = 200;
		b[2] = 300;
		b[3] = 400;
			
		// enhanced for loop(값만 알고 싶을 때)
		for(int i : b){ // b의 값을 i에 저장하여 출력해주는 역할
			System.out.println(i);
		}
		
	}
}
