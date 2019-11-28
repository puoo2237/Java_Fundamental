package java_20191127.step5;

// 강제성을 부여하기 위해 abstract
public abstract class StopWatch {
	long startTime;
	long endTime;
	
	public abstract void run(); // 강제성 생김 
}
