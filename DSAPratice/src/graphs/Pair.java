package graphs;

import java.util.ArrayList;
import java.util.List;

import graphs.LoudandRich.Node;

public class Pair<T1, T2> {
	boolean key;
	int value;
	
	
	public Pair(boolean b,int value) {
		// TODO Auto-generated constructor stub
		this.key=b;
		this.value=value;
	}
	public boolean getKey() {
		return this.key;
	}
	public int getValue() {
		return this.value;
	}

}
