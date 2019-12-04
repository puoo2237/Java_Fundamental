package java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("C:\\dev\\io\\2019\\12\\test.txt");
			br = new BufferedReader(fr); // streaming chaining
			fw = new FileWriter("C:\\dev\\io\\2019\\12\\test-copy2.txt");
			bw = new BufferedWriter(fw);
			
			String readLine = null;
			while((readLine = br.readLine()) != null){
				bw.write(readLine); // 개행을 포함하지 않음
				bw.newLine();
			}
			bw.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(fr != null) fr.close();
					if(br != null) br.close();
					if(bw != null) bw.close();
					if(fw != null) fw.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
