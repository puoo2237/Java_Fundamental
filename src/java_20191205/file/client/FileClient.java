package java_20191205.file.client;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {
	private String ip;
	private int port;
	
	public FileClient(String ip, int port){
		this.ip = ip;
		this.port = port;
	}
	public void run(){
		try {
			Socket socket = new Socket(ip, port);
			String fileName = "scott.sql";
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write(fileName);
			bw.newLine();
			bw.flush();
			
			InputStream in = socket.getInputStream();
			// network에서 읽은 파일을 local에 저장
			FileOutputStream fos = new FileOutputStream("C:\\dev\\io\\" + fileName);
			byte[] readBytes = new byte[1024*8];
			int readByteCount = 0;
			
			while((readByteCount = in.read(readBytes)) != -1){
				fos.write(readBytes, 0, readByteCount);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new FileClient("192.168.0.203", 3033).run();
	}
}
