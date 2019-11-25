package java_20191122.aa;

public class NoticeDemo {
	public static void main(String[] args) {
		Notice n = new Notice();
		n.number = 10;
		n.title = "title";
		n.hit = 100;
		
		//같은 패키지 내에서 private은 접근금지
//		n.regdate = "2019-11-22"; 
	}
}
