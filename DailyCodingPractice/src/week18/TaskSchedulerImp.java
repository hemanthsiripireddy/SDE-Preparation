package week18;

public class TaskSchedulerImp {
	public static void method() {
		char ch[]= {'A','B','C','A','B'};
		int n=2;
		TaskScheduler t=new TaskScheduler();
		int res=t.leastInterval(ch, n);
		System.out.println(res);
	}

}
