package java_20191203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		System.out.print("입력하세요>");
		InputStream in = System.in; // 소스(Source)가 키보드인 경우
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		isr = new InputStreamReader(in);
		br = new BufferedReader(isr);
		
		try {
			String readLine = null;
			while((readLine = br.readLine()) != null){
				if(readLine.equals("exit")) break;
				System.out.println(readLine);
				System.out.print("입력하세요>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				try {
					if(in != null) in.close();
					if(br != null) br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
