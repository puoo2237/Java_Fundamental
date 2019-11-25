package java_20191120;

public class SwitchDemo {
	public static void main(String[] args){
		
		int month = Integer.parseInt(args[0]);
		String season = null;
		
		// 수식의 자료형이 정해져 있음(char, byte, short, int, String)
		// 케이스에 속하지 않은 경우 실행되기 때문에 default의 위치는 어디든 상관없음
		// 마지막 문장은 break할 필요없음
		switch (month) {
			case 12:
			case 1: 
			case 2: season = "겨울"; break;
			case 3:  
			case 4:  
			case 5:  season = "봄"; break;
			case 6: 
			case 7: 
			case 8:  season = "여름"; break;
			case 9: 
			case 10:
			case 11:  season = "가을"; break;
			default: season = "없는계절"; 
		}
		System.out.println(month + "월은 " + season + " 입니다.");
	}
}
