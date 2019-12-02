package homework;

public class Calendar {
	private int year;
	private int month;
	private int day;
	private int totalCount;
	String[] weekday = {"월", "화", "수", "목", "금", "토", "일"};
	int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int year, int month, int day) {
		totalCount = (year - 1) * 365 + (year / 4) - (year / 100) + (year / 400);
		
		for (int i = 0; i < (month - 1); i++) {
			totalCount += monthArray[i];
		}
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			totalCount++;
		}
	}

	public String[] getWeekday() {
		return weekday;
	}

	public void setWeekday(String[] weekday) {
		this.weekday = weekday;
	}

	public int[] getMonthArray() {
		return monthArray;
	}

	public void setMonthArray(int[] monthArray) {
		this.monthArray = monthArray;
	}

	public Calendar(int year, int month, int day){

		System.out.printf("오늘은 %s요일입니다.", weekday[totalCount % 7]);
	}
	
	public Calendar(int year, int month){
		this(year, month, 0);
	}
	
	public Calendar(int year){
		this(year, 0, 0);
		
	}
	
	
	public static void main(String[] args) {
		Calendar date = new Calendar(2019, 12, 3);
		System.out.println();
	}
	
}
