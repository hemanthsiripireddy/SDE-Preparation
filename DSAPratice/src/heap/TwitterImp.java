package heap;

import java.util.List;
import java.util.PriorityQueue;

public class TwitterImp {
	public static void method() {
		Twitter t=new Twitter();
		t.postTweet(1, 4);
		t.postTweet(2, 5);
		t.unfollow(1,2);
		t.follow(1,2);
		
		
		List<Integer>tweets=t.getNewsFeed(1);
		for(int i:tweets) {
			System.out.print(i+" ");
		}
		
	}

}
