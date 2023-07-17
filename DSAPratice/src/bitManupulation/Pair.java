package bitManupulation;

public class Pair<T1, T2> {
	boolean key;
	int val;
	
	public Pair(boolean key, int val) {
		super();
		this.key = key;
		this.val = val;
	}
	public boolean getKey() {
		return key;
	}
	public void setKey(boolean key) {
		this.key = key;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	

}
