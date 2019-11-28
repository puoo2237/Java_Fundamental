package java_20191127.step6;

// 강제성을 부여하기 위해 abstract
public abstract class StopWatch {
	// 멤버변수에 대한 Encapsulation
	private long startTime;
	private long endTime;
	public void setStartTime(long startTime){
		this.startTime = startTime;
	}
	public long getStartTime(){
		return startTime;
	}
	public void setEndTime(long endTime){
		this.endTime = endTime;
	}
	public long getEndTime(){
		return endTime;
	}
	
	public abstract void run(); // 강제성 생김 
}
