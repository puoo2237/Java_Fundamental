package java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NaverScaningDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.naver.com/");
		InputStream in = url.openStream();
		
		// 1. InputStream을 InputStreamReader 로 스트림 체이닝한다.
		// 2. InputStreamReader를 BufferedReader로 스트림 체이닝한다.
		// 3. BufferedReader로 읽은 정보(HTML)를 C:\\dev\\io\\2019\\12\\naver.html 파일로 저장한다.
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		isr = new InputStreamReader(in);
		br = new BufferedReader(isr);
		fw = new FileWriter("C:\\dev\\io\\2019\\12\\naver.html");
		bw = new BufferedWriter(fw);
		
		String readLine = null;
		while((readLine = br.readLine()) != null){
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();
	}
}
