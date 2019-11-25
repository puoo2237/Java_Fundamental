package homework;

public class Homework2 {
	public static void main(String[] args) {
		// 문자 reverse 하기
		// 1. input "abcd" => "dcba"
		// 2. input "abcde" => "edcba"

		char tmp;
		String input = "abcd"; 
		String input1 = "abcde";
		char[] ch = input.toCharArray();
		char[] ch1 = input1.toCharArray();
		

		for (int j = 0; j < ch.length / 2; j++) {
			tmp = ch[j];
			ch[j] = ch[(ch.length - 1) - j];
			ch[(ch.length - 1) - j] = tmp;
		}
		
		for (int j = 0; j < ch1.length / 2; j++) {
			tmp = ch1[j];
			ch1[j] = ch1[(ch1.length - 1) - j];
			ch1[(ch1.length - 1) - j] = tmp;
		}

		System.out.println(ch);
		System.out.println(ch1);

		
		
		// 1-100까지 소수를 구하시오
		int count; // 나머지가 0인 값의 수
		int jInfo; // j값 저장

		for (int i = 2; i <= 100; i++) {
			count = 0;
			jInfo = 0;
			for (int j = 2; j <= i; j++) {

				if (i % j == 0) {
					count += 1;
					jInfo = j;
					break;
				}
			}
			if (count == 1 && i == jInfo) {
				System.out.print(i + "\t");
			}
		}
	}
}
