package java_20191120;

public class ContinueDemo {

	public static void main(String[] args) {
		// continue: 그 이하를 수행하지 말고, 다음 조건으로 패스
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i == 6)
				continue; // i == 6을 제외하고 누적합
			sum += i;
		}
		System.out.println(sum);

		outter: 
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 4 && j == 9)
					continue outter;
				System.out.printf("%d * %d = %d %n", i, j, i * j);
			}
		}
	
	}
}
