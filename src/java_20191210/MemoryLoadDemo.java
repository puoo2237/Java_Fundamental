package java_20191210;

public class MemoryLoadDemo {
	public static void main(String[] args) {
		try {
			Class.forName("java_20191210.MemoryLoad").newInstance();
			
			MemoryLoad m = new MemoryLoad();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
