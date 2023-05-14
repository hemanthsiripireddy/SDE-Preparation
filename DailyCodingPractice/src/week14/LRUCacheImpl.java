package week14;

public class LRUCacheImpl {
	public static  void method() {
		LRUCache l=new LRUCache(2);
		l.put(1, 1);
		l.put(2, 2);
		System.out.println(l.get(1));
		l.put(3, 3);
		System.out.println(l.get(2));
	}

}
