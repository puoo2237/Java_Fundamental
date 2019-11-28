package java_20191128;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringDemo {
	public static void main(String[] args) {
		String str = "111111-1111118";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)); // 특정 인덱스의 문자를 추출할 때 사용
		}
		str = str.concat("abcd"); // == str + "abcd"
		System.out.println(str);
		
		
		// 특정 패턴으로 끝나는 부분 검색: endsWith
		String fileName = "abc.zip";
		if(fileName.endsWith("zip")){
			System.out.println("zip 파일입니다");
		}else if(fileName.endsWith("ppt")){
			System.out.println("PPT 파일입니다");
		}
		// 특정 패턴으로 시작하는 부분 검색: startsWith
		String uri = "artist/index.jsp";
		if(uri.startsWith("artist")){
			System.out.println("작가 페이지입니다.");
		}else if(uri.startsWith("exhibition")){
			System.out.println("전시 페이지입니다.");
		}
		
		// 대소문자 구분없이 문자열 비교: equalsIgnoreCase
		System.out.println("abc".equalsIgnoreCase("Abc"));
		
		String s1 = "a";
		String s2 = "성";
		System.out.println(s1.getBytes().length);
		System.out.println(s2.getBytes().length);
		
		// 특정 문자의 위치값 반환: indexOf
		System.out.println(str.indexOf("-"));
		fileName = "abc.bde.fafb.asdf.ppt";
		
		// 마지막에 위치한 특정 패턴 위치값 반환: lastIndexOf
		System.out.println(fileName.length());
		System.out.println(fileName.lastIndexOf("."));
		
		// 문자열 추출: substring
		// 주의할점: end는 추출하고 싶은 인덱스 + 1 까지 설정해줘야함
		System.out.println(fileName.substring(0, 3));
		System.out.println(str.substring(0, str.indexOf("-")));
		System.out.println(str.substring(7)); // 뒤에 값이 없으면 지정한 부분부터 끝까지
		
		// 문자열 변경: replaceAll(String regular expression(정규표현식), String replace)
		System.out.println(str.replaceAll("[a-d]", ""));
		System.out.println(str.replace("abcd", ""));
		String content = "abc\nabc\nabc\nabc";
		System.out.println(content.replaceAll("\n", "<br>"));
		
		// 문자열의 앞뒤 공백제거: trim
		s1 = "abc";
		s2 = "abc ";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s1.equals(s2.trim()));
		
		// primitive 데이터 타입 8개를 string으로 바꿔줌
		System.out.println(String.valueOf(100));	// 100 +	"";
		s1 = String.valueOf(100);
		
		// split(delimiter구분자와 token토큰으로 분리)
		String phone = "010-3024-1703";
		String[] temp = phone.split("-");
		for (String string : temp) {	
			System.out.println(string);
		}
		
		// format
		// conversion: %d, %t: time, %d, %n: 개행
		System.out.println(String.format("%,d", 10000000));
		System.out.println(String.format("I have %,2f bugs to fix", 47345.0985));
		System.out.format("I have %,2f bugs to fix %n", 47345.0985);
		
		str = String.format("%3$,20d %d %d", 10, 20, 300000000); // $ + 숫자: 순서 조절 
		System.out.println(str);
	}
}
