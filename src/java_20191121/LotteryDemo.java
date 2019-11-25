package java_20191121;

public class LotteryDemo {
	public static void main(String[] args) {
		// Math.random() => 0보다 크거나 같고, 1보다 작은 임의의 double 값을 변환

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			double random = Math.random();
			int temp = (int) (random * 45) + 1;
			
			// temp 값을 현재위치에 무조건 집어 넣음, 만약 중복되는 경우는 i 값을 증가시키지 않고 새로운 temp값을 넣기 때문에 문제가 생기지 않음. 
			lotto[i] = temp;

			for (int j = 0; j < i; j++) {
				if (lotto[j] == temp) {
					i--;  
					break; // break: for문을 빠져나가는 수단
				}
			}
			// 여기에 lotto[i] = temp; 를 사용하지 않는 이유는 i를 감소 시켰기 때문
		}

		// 오름차순(bubble sort)
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length - (i + 1); j++) {
				if (lotto[j] > lotto[j + 1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}

		for (int i : lotto) {
			System.out.print(i + "\t");
		}
	}
}
