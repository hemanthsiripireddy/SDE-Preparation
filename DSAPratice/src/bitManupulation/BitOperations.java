package bitManupulation;

public class BitOperations {
	
	public static void method() {
		int res=clearBit(7,2);
		System.out.println(res);
	}
	public static int getBit(int n, int i) {
		return n&(1<<i);
	}
	public static int setBit(int n, int i) {
		return n|(1<<i);
	}
	public static int clearBit(int n, int i) {
		int temp=~(1<<i);
		return n&(temp);
	}

}
