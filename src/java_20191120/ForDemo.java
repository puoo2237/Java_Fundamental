package java_20191120;

public class ForDemo {
	public static void main(String[] args) {

		// printf vs println
		String str = "hello";
		int a1 = 10;
		int a2 = 20;
		double d1 = 12.4567;
		System.out.printf("%s, %d, %d, %.4f %n", str, a1, a2, d1);
		System.out.println(str + ", " + a1 + ", " + a2 + ", " + d1);

		// 1~100까지의 합
		int sum = 0;
		long start = System.currentTimeMillis();
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("경과시간 :" + (end - start) / 1000);
		System.out.printf("1부터 100까지 합은 %d 입니다. %n", sum);

		// 구구단
		for (int first = 2; first <= 9; first++) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d %n", first, second, first * second);
			}
		}
		for (int first = 9; first >= 2; first--) {
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d * %d = %d %n", first, second, first * second);
			}
		}

		// * 찍기
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("*");
			}
			System.out.printf("%n");
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.printf("%n");
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.printf("*");
			}
			System.out.printf("%n");
		}

	}
}
