package java_20191126;

//import java.lang.*; // 생략되어있음
public class Super { // Super 뒤에 extends Object 생략
	int money;
	
	public Super(){ // 생성자를 만들 때는 오류가 날 수도 있으니 default를 무조건 생성!
		super();
	}
	public Super(int money){
		super();
		this.money = money;
	}
	public void makeMoney(){
		System.out.println("Super makeMonkey()");
	}
	public void play(String omok){
		System.out.println("Super play()");
	}
}
