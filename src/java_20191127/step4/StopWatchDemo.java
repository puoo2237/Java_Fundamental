package java_20191127.step4;

// 1. 실제 비지니스 로직이 있는 클래스와 실행되는 클래스를 분리해보자
// 2. 시간을 측정하는 기능을 메서드로 추출
public class StopWatchDemo {
	public void execute(StopNanoWatch s){
		s.start();
		for (long i = 0; i < 5000000000l; i++) {

		}
		s.stop();
		
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간: %.9f %n", elapsedTime);
	}
	public void execute(StopMilliWatch s){
		s.start();
		for (long i = 0; i < 5000000000l; i++) {
			
		}
		s.stop();
		
		double elapsedTime = s.getElapsedTime();
		System.out.printf("경과시간: %.3f %n", elapsedTime);
	}
	
		//		new StopWatchDemo().execute();
		public static void main(String[] args) {
			StopWatchDemo swd = new StopWatchDemo();
			StopNanoWatch s = new StopNanoWatch();
			swd.execute(s);
			
			StopMilliWatch s1 = new StopMilliWatch();
			swd.execute(s1);
		}
}
