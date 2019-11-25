package java_20191121;

public class CalendarDemo {
	public static void main(String[] args) {

		/*
		 * 달력 만들기 
		 * 1. 1년 1월 1일은 월요일 
		 * 2. 1년 365일, 윤년은 466일 (2월 29일) 
		 * 3. 윤년은 4년마다 발생하고 그중에서 100배수는 제외하고 400배수는 제외하지 않는다. 
		 * 4. 2019년 12월 25은 무슨 요일?
		 */

		int year = 2019;
		int month = 12;
		int day = 25;
		String message = null;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 년 => 일수 계산하기
		int total = (year - 1) * 365 + (year / 4) - (year / 100) + (year / 400);

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
}
