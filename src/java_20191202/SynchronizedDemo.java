package java_20191202;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;
	
	// synchronized: synchronized: 하나의 thread가 마무리 될 때까지 다른 thread에게 넘기지 않음
	// 하나의 객체를 서로 공유하고 있을 때 사용함
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
//		synchronized(SynchronizedDemo.class){
			for(int i = 0; i < 1000; i++){
				x++;
				y++;
				String threadName = Thread.currentThread().getName();
				System.out.printf("x : %d, y : %d - %s%n", x, y, threadName);
			}
//		}
	}
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		
		t1.start();
		t2.start();
		
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		new Thread(s1).start();
	}
}
