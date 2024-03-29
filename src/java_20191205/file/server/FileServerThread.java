package java_20191205.file.server;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class FileServerThread implements Runnable {
	private Socket socket;

	public FileServerThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String fileName = br.readLine();
			FileInputStream fis = new FileInputStream("C:\\dev\\io\\2019\\12\\" + fileName);
			byte[] readBytes = new byte[1024*8];
			int readByteCount = 0;
			// network로 out
			OutputStream out = socket.getOutputStream(); // socket으로 output으로 만들었기 때문에 network로 out
			while((readByteCount = fis.read()) != -1){
				out.write(readBytes, 0, readByteCount);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
