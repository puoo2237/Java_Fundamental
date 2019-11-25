package java_20191119;

public class CharLiteralDemo {
	public static void main(String[] args) {
		
		// 1. 유니코드 표현 => '\u0000';
		char c1 = '\uCD5C';
		char c2 = '\uC2B9';
		char c3 = '\uD76C';
			
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		// 2. 아스키코드 표현
		// 65: A ~ 90: Z,  97: a ~ 122: z, 48: 0 ~ 57: 9
		char c4 = 97;
		System.out.println(c4);
		
		// 3. 문자 표현 => ''
		// 문자열: ""
		char c5 = 'a';
		char c6 = '★';
		System.out.println(c5);
		System.out.println(c6);
		
		// 4. escape char
		// \n => line feed
		// \t => tab
		// \\ => \
		// \" => "
		// \' => '
		
		System.out.println("hello\n" + "world");
		System.out.println("hello\t" + "world");
		
		String path = "C:\\dev\\\"eclipse\"";
		System.out.println(path);
	}

}
