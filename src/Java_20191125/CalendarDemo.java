package Java_20191125;

public class CalendarDemo {
	// 외부에서 보이지 않게 하기 위해서 private으로 멤버변수 생성
	private int year;
	private int month;
	private int day;
	private int total;
	int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public void set(int y, int m, int d){
		year = y;
		month = m;
		day = d;
	}

	public int getTotalCount(){
		// 년 => 일수 계산하기
		total = (year - 1) * 365 + (year / 4) - (year / 100) + (year / 400);

		// 11월까지 더하기
		for (int i = 0; i < (month - 1); i++) {
			total += monthArray[i];
		}
		
		// 윤달 고려하여 계산하기
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			total += 1;
		}

		// 나머지 일수 더해주기
		total += day;
		
		return total;
	}
	
	public void print(){
		String message = null;
		
		switch (total % 7) {
		case 1:
			message = "월요일";
			break;
		case 2:
			message = "화요일";
			break;
		case 3:
			message = "수요일";
			break;
		case 4:
			message = "목요일";
			break;
		case 5:
			message = "금요일";
			break;
		case 6:
			message = "토요일";
			break;
		case 0:
			message = "일요일";
			break;
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message);
	}
	
	public static void main(String[] args) {
		CalendarDemo c = new CalendarDemo();
		c.set(2019, 11, 25); // year, month, day에 값 저장
		c.getTotalCount(); // total 값 저장
		c.print(); // 조건에 해당하는 값을 출력
	}
}
