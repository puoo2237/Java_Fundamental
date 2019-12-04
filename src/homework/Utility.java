package homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utility {
	public static boolean isCopy(String fromFile, String toFile){
		FileReader fr = null;
		FileWriter fw = null;
		boolean isSuccess = false;
		
		try {
			fr = new FileReader(fromFile);
			fw = new FileWriter(toFile);
			
			char[] readChars = new char[10];
			int readCharCount = 0;
			while((readCharCount = fr.read(readChars)) != -1){
				System.out.print(new String(readChars, 0, readCharCount));
				fw.write(readChars, 0, readCharCount);
			}
			isSuccess = true;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fr != null) 	fr.close();
					if(fw != null) 	fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return isSuccess;
	}
	
	public static String getDate(String pattern){
		return new SimpleDateFormat(pattern).format(Calendar.getInstance().getTime());
	}
}
