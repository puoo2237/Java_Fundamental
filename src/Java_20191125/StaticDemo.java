package Java_20191125;

public class StaticDemo {
	static String name;
	int age;
	
	// m1()호출이 됐다는 것은 메모리상에 이미 올라와져있기 때문
	// static, instance 변수/메서드 사용가능
	public void m1(){ 
		name = "sung"; // 인스턴스 메서드에서는 static 변수 사용 가능
		age = 10; // 인스턴스 메서드에서는 인스턴스 변수 사용가능
		m2(); // 인스턴스 메서드에서는 인스턴스 메서드 호출가능
		m4(); // 인스턴스 메서드에서는 static 메서드 호출가능
	}
	public void m2(){
		System.out.println("instance method m2()");
	}
	
	public static void m3(){ // static 변수/메서드 사용가능
		name = "sung";
//		age = 10; // static 메서드에서는 인스턴스 변수 사용불가 => 객체 생성 필요
//		m2(); // static 메서드에서는 인스턴스 메서드 호출 불가 
		m4();
		
		// 객체생성(new)으로 instance 호출 가능
		StaticDemo sd = new StaticDemo();
		sd.age = 10;
		sd.m2();
	}
	public static void m4(){
		System.out.println("instance method m4()");
	}

}
