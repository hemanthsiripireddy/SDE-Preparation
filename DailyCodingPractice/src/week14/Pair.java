package week14;

public class Pair<T1, T2> {
	int key;
	int value;
	Pair(int key,int value){
		this.key=key;
		this.value=value;
		
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	

}
