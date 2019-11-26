package Java_20191126;

public class ShapeDemo {
	public static void run(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성할 수 없음
		// Shape s = new Shape(); // <- 불가능한 경우
		Shape s1 = new Rectangle();
		s1.draw();

		Shape s2 = new Triangle();
		s2.draw();

		run(new Rectangle()); // Shape s = new Rectangle();
		run(new Triangle());
	}
}
