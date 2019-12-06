package homework;

public class Calendar {
	private int totalCount;
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	

	public int getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}


	public int[] getMonthArray() {
		return monthArray;
	}


	public void setMonthArray(int[] monthArray) {
		this.monthArray = monthArray;
	}


	private int getCount(int year, int month, int day){
		// 년 수 계산하기
		totalCount = (year - 1) * 365 + (year / 4) - (year / 100) + (year / 400);
		
		// 달 수 계산하기
		for (int i = 0; i < (month - 1); i++) {
			totalCount += monthArray[i];
		}
		
		// 윤달 고려하기
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			totalCount += 1;
		}
		
		// 일 수 계산하기
		totalCount += day;
		
		return totalCount;
		
	}
	
	public void print(int year, int month, int day){	
		String message = null;

		switch (getCount(year, month, day) % 7) {
		case 1:
			message = "월요일"; break;
		case 2:
			message = "화요일"; break;
		case 3:
			message = "수요일"; break;
		case 4:
			message = "목요일"; break;
		case 5:
			message = "금요일"; break;
		case 6:
			message = "토요일"; break;
		case 0:
			message = "일요일"; break;
		}
		System.out.printf("%d년 %d월 %d일 %s 입니다.", year, month, day, message);
		
	}

}
