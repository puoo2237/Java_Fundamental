package java_20191122;

public class Customer {
	
	// 1. instance variable
	public String name;
	public String email;
	public String phone;
	public int age;
	public double balance;
	public boolean isReleased; 
	
	// 2. static variable
	public static double interestRate;
		
	// final의 경우, 관례상 변수이름을 '대문자'로 사용
	// 변수선언시, 값을 할당(초기화)해줘야함 <- 값을 변경할 수 없기 때문에
	public static final String BANKNAME = "신한은행"; 
	
	
}
