package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Twitter {
	Map<Integer, User>users;
	int it = 0;
	Map<Integer, PriorityQueue<User>> following;

	public Twitter() {
		users = new HashMap<>();
		following = new HashMap<>();

	}

	public void postTweet(int userId, int tweetId) {
		
		if (!users.containsKey(userId)) {
			users.put(userId, new User(userId));
		}
		users.get(userId).tweets.add(new Pair(tweetId, it++));
		follow(userId,userId);

	}

public List<Integer> getNewsFeed(int userId) {
    Map<Integer,List<Pair>>temp=new HashMap<>();
    List<Integer>res=new ArrayList<>();
    int i=0;
    while(i<10){
       if(!following.containsKey(userId)||following.get(userId).size()==0 ||following.get(userId).peek().tweets.size()==1){
           break;
           
       }
       User user=following.get(userId).poll();
       if(!temp.containsKey(user.userID)){
           temp.put(user.userID,new ArrayList<>());
       }
       
           Pair pair=user.tweets.get(user.tweets.size()-1);
           temp.get(user.userID).add(pair);
           user.tweets.remove(user.tweets.size()-1);
           res.add(pair.tweet);

      
       i++;
       if(user.tweets.size()>1){
           following.get(userId).add(user);
       }
    }
    for(int key:temp.keySet()){
       PriorityQueue pq= following.get(userId);
       User user=contains(pq,key);
       if(user==null){
           User nu=new User(key);
           users.put(key, nu);
           pq.add(nu);
           for(Pair pair:temp.get(key)){
               nu.tweets.add(pair);
               
           }
           Collections.sort(nu.tweets,(p1,p2)->{
        	   return p2.inc-p1.inc;
           });
       }else{
            for(Pair pair:temp.get(key)){
               user.tweets.add(pair);
               
           }
            Collections.sort(user.tweets,(p1,p2)->{
         	   return p2.inc-p1.inc;
            });

       }

    }
    return res;
    //return y-x
}

	public void follow(int followerId, int followeeId) {
		if (!users.containsKey(followeeId)) {
			users.put(followeeId, new User(followeeId));
		}
		if (!users.containsKey(followerId)) {
			users.put(followerId, new User(followerId));
		}
		if (!following.containsKey(followerId)) {
			following.put(followerId, new PriorityQueue<>((p1, p2) -> {
				return p2.tweets.get(p2.tweets.size() - 1).inc - p1.tweets.get(p1.tweets.size() - 1).inc;
			}));
		}
		PriorityQueue<User>pq=following.get(followerId);
		if(contains(pq, followeeId)==null) {
			pq.add(users.get(followeeId));
			
		}

	}

	public void unfollow(int followerId, int followeeId) {

		List<User> temp = new ArrayList<>();
		PriorityQueue<User>pq=following.get(followerId);
		if(contains(pq,followeeId)==null)
			return;
		while (true) {
			User user = following.get(followerId).poll();
			
				
			if (user.userID == followeeId)
				break;
			temp.add(user);
		}
		for (User user : temp) {
			following.get(followerId).add(user);
		}

	}

	public User contains(PriorityQueue<User> pq, int userId) {
		for (User user : pq) {
			if (user.userID ==userId)
				return user;
		}
		return null;
	}
}
