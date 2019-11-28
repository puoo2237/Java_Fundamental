package java_20191128;

public class StringBufferDemo {
	public static void main(String[] args) {
		// StringBuffer: 문자열 비교(불가변)보다는 추가(가변)용도
		// 같은 객체 참조하기 때문에 call by reference 가능
		StringBuffer s1 = new StringBuffer("test");
		StringBuffer s2 = new StringBuffer("test");
		// StringBuffer 클래스는 Object의 equals() 메서드를 overriding 하지 않았기 때문에 
		// equals()를 사용하면 StringBuffer의 false가 반환된다.
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1); // toString을 overriding을 했기 때문에 "test" 출력
		
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3.equals(s4));
		
		StringBuffer sql = new StringBuffer();
		sql.append("select name, age");
		sql.append("from member");
		sql.append("where name = '성영한'");
		System.out.println(sql);
		
		// sql 모든 문자 지우기
		sql.setLength(0);
		System.out.println(sql.length());
		sql.append("select no, writer");
		sql.append("from board");
		System.out.println(sql);
	}
}
