package designPattern.creational;



 class SingletonType1 {
	/*
	 * eagerly initialized singleton
	 */
	private static SingletonType1 instance =new SingletonType1();
	private SingletonType1() {};
	public static SingletonType1 getInstance() {
		return instance;
	}

}
class SingletonType2 {
	/*
	 * static block initialization
	 */
	private static SingletonType2 instance;
	static {
		instance=new SingletonType2();
	}
	private SingletonType2() {};
	public static  SingletonType2 getInstance() {
		return instance;
	}

}
class SingletonType3 {
	/*
	 * lazy initialization
	 */
	private static SingletonType3 instance;
	private SingletonType3() {};
	public static SingletonType3 getInstance() {
		if(instance==null)
		instance=new SingletonType3();
		return instance;
	}

}
class SingletonType4 {
	/*
	 * thread safe
	 * it's is very slow 
	 */
	//private SingletonType4() {};
	private static SingletonType4 instance;
	private SingletonType4() {};
//	public static synchronized SingletonType4 getInstance() {
//		if(instance==null)
//			instance=new SingletonType4();
//		return instance;
//	}
	public static  SingletonType4 getInstance() {
		if(instance==null) {
			synchronized (SingletonType4.class) {
				if(instance==null)
					instance=new SingletonType4();
				
			}
		}
			
		return instance;
	}

}
class SingletonType5 {
	private static  class SingletonCreator {
		private static final SingletonType5 instance =new SingletonType5();
	}
	private SingletonType5() {};
	public static SingletonType5 getInstance() {
		return SingletonCreator.instance;
	}

}

 enum SingletonType6 {
	SINGLETON_INSTANCE;

}
  
  
   
    
     


