package java_20191128;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagementDemo {
	private ArrayList<Member> list;
	
	public MemberManagementDemo(){
		list = new ArrayList<Member>();
	}
	
	public void print(){
		System.out.println("********************************************");
		System.out.println("*1)insert 2)update 3)delete 4)search 5)exit*");
		System.out.println("********************************************");
	}
	
	
	public String console(String msg){
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	public void run(String index){
		if(index.equals("1")){
			insert();
		}else if(index.equals("2")){
			
		}else if(index.equals("3")){
			
		}else if(index.equals("4")){
			
		}else if(index.equals("5")){
			
		}else{
			System.out.println("사요나라!!");
		}
	}
	
	// 1. 아이디를 입력받는다.
	// 2. 이름을 입력받는다.
	// 3. ArrayList에 멤버를 추가한다.
	// 4. print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
	// 5. 번호를 선택하세요> 메세지를 출력한 후 키보들 입력을 받게 대기 한다.
	public void insert(){
		
	}
	
	
	public static void main(String[] args) {
		MemberManagementDemo m1 = new MemberManagementDemo();
		m1.print();
		String index = m1.console("번호를 선택하세요>");
		System.out.println(index);
		m1.run(index);
	}
}
