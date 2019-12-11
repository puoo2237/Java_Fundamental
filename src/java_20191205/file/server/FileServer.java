package java_20191205.file.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	private int port;
	public FileServer(int port){
		this.port = port;
	}
	public void run(){
		FileServerThread fst = null;
		ServerSocket serverSocket = null;
		
		
		try {
			serverSocket = new ServerSocket(port);
			while(true){
				System.out.println("클라이언트 접속을 기다리고 있습니다.");
				Socket socket = serverSocket.accept();
				System.out.println("클라이언트가 접속했습니다.");
				
				fst = new FileServerThread(socket);
				Thread t = new Thread(fst);
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileServer(3033).run();
		
	}
}
