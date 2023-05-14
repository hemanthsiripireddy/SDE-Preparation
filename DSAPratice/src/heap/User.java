package heap;

import java.util.ArrayList;
import java.util.List;

class User {
	int userID;
	List<Pair> tweets;

	public User(int userID) {
		this.userID = userID;
		tweets = new ArrayList<>();
		tweets.add(new Pair(34545,-344));
	}
}