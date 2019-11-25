package java_20191121;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = {"apple", "banana", "watermelon", "peach"};
		
		String[] temp = new String[6];
		
		// 1. System.arraycopy
		// fruits => 원본배열
		// 0 => 원본배열의 위치. 즉 원본배열의 복사할 시작위치
		// temp => 복사할 배열
		// 2 => 복사할 배열의 시작위치
		// 4 => 원본배열의 4개 요소를 복사
		System.arraycopy(fruits,  0,  temp,  2,  4);
		temp[0] = "blueberry";
		temp[1] = "rasberry";
		
		for (String fruit : temp) {
			System.out.println(fruit);
		}
		
		// 2. 할당을 통해 copy
		String[] ref = fruits; // 같은 객체를 참조 <- reference
		ref[0] = "jobs";
		
		System.out.println(ref[0]);
		System.out.println(fruits[0]);
		
		// primitive의 '=='는 값의 동일성을 가지고 판단
		// reference의 '=='의 참조값의 동일성을 가지고 판단
		int[] a = {1, 2, 3, 4};
		int[] b = {1, 2, 3, 4};
		int[] c = b;
		System.out.println(a == b);
		System.out.println(c == b);
		
	}
}
