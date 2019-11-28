package java_20191127.step6;

// 1. 모든 클래스의 Encapsulation
// 2. 메인 클래스의 Java Reflection 추가 
public class StopWatchDemo {
	public void execute(StopWatch s){
		s.run();
	}

	//		new StopWatchDemo().execute();
	public static void main(String[] args) throws Exception{
		String input = args[0];
		String className = "java_20191127.step6." + input;
		StopWatch s =  (StopWatch)Class.forName(className).newInstance();
		StopWatchDemo swd = new StopWatchDemo();
		swd.execute(s);

		
//		StopWatchDemo swd = new StopWatchDemo();
//		StopNanoWatch s = new StopNanoWatch();
//		swd.execute(s);
//		
//		StopMilliWatch s1 = new StopMilliWatch();
//		swd.execute(s1);
//
//		StopMicroWatch s2 = new StopMicroWatch();
//		swd.execute(s2);
	}
}
