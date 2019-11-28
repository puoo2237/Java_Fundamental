package java_20191126;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.age = 55;
		p1.work();
		p1.playBadook();
		
		Child c1 = new Child();
		c1.age = 25;
		c1.height = 155.24;
		c1.playBadook();
		c1.playGame();
		c1.work(); // 자기자신 호출
		
		// 객체의 형변환
		Parent p2 = new Child(); // auto casting
		p2.age = 25;
//		p2.height = 155.24;
		p2.playBadook();
//		p2.playGame();
		p2.work(); // Parent의 work가 아니라 Child의 work 호출
		
//		Child c2 = (Child)new Parent(); // 강제 casting => class casting error
	}
}
