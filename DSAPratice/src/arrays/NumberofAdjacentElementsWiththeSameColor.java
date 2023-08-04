package arrays;

public class NumberofAdjacentElementsWiththeSameColor {
	static class Pair{
		int start;
		int end;
		public Pair(int start,int end){
			this.start=start;
			this.end=end;

		}
	}
	public static void client() {
		int[][] queries= {{11,3},{5,1},{16,2},{4,4},{5,1},{13,2},{15,1},{15,3},{8,1},{14,4},{1,3},{6,2},{8,2},{2,2},{3,4},{7,1},{10,2},{14,3},{6,5},{3,5},{5,5},{9,2},{2,3},{3,3},{4,1},{12,1},{0,4},{16,4},{8,1},{14,3},{15,3},{12,1},{11,5},{3,1},{2,4},{10,1},{14,5},{15,5},{5,2},{8,1},{6,5},{10,2}};
		int n=17;
		int res[]= colorTheArray(n, queries);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

	public static int[] colorTheArray(int n, int[][] queries) {
		int[] ans=new int[queries.length];
		int res=0;
		int[] nums=new int[n];
		Pair[] dp=new Pair[n];
		if(n==1)
		return new int[queries.length];
		for(int i=0;i<n;i++){
			dp[i]=new Pair(i,i);
		}
		for(int i=0;i<queries.length;i++){
			int index=queries[i][0];
			int color=queries[i][1];

			if(color!=nums[index]){
				if(index==0){
					if(dp[0]==dp[1]){
						res-=(dp[0].end=dp[1].start);
					}else{
						res-=(dp[1].end-dp[1].start);
					}
					nums[0]=color;
					if(color==nums[1]){
						Pair pair=dp[1];
						pair.start=0;
						dp[0]=pair;
						res+=(pair.end-pair.start);
					}else{
						Pair pair=new Pair(0,0);
						dp[0]=pair;
						dp[1].start=1;
						res+=(dp[1].end-1);
					}


				}else if(index==n-1){
					if(dp[n-1]==dp[n-2]){
						res-=(dp[n-1].end=dp[n-1].start);
					}else{
						res-=(dp[n-2].end-dp[n-2].start);
					}
					nums[n-1]=color;
					if(color==nums[n-2]){
						Pair pair=dp[n-2];
						pair.end=n-1;
						dp[n-1]=pair;
						res+=(pair.end-pair.start);
					}else{
						Pair pair=new Pair(n-1,n-1);
						dp[n-1]=pair;
						dp[n-2].end=n-2;
						res+=(dp[n-2].end-dp[n-2].start);
					}
					

				}else{
					if(dp[index-1]==dp[index]&&dp[index]==dp[index+1]){
						res-=(dp[index].end-dp[index].start);
						int start=dp[index].start;
						int end=dp[index].end;
						int mid=index;
						dp[index]=new Pair(index,index);
						update(start,index-1,dp);
						update(index+1,end,dp);
						nums[index]=color;
						res+=(index-1-start);
						res+=(end-(index+1));
					}else if(dp[index-1]==dp[index]){
						dp[index-1].end=index-1;
						dp[index]=new Pair(index,index);
						nums[index]=color;
						if(color!=nums[index+1])
						res--;
					}else if(dp[index+1]==dp[index]){
						dp[index+1].start=index+1;
						dp[index]=new Pair(index,index);
						nums[index]=color;
						if(color!=nums[index-1])
						res--;

					}else{
						
						
						if(nums[index-1]==color&&color==nums[index+1]){
							res-=(dp[index-1].end-dp[index-1].start);
						    res-=(dp[index+1].end-dp[index+1].start);
							nums[index]=color;
							update(dp[index-1].start,dp[index+1].end,dp);
							res+=(dp[index].end-dp[index].start);
						}else if(nums[index-1]==color){
							dp[index-1].end=index;
							dp[index]=dp[index-1];
							nums[index]=color;
							res++;

						}else if(nums[index+1]==color){
							dp[index+1].start=index;
							dp[index]=dp[index+1];
							nums[index]=color;
							res++;
						}else {
							nums[index]=color;
						}
						
					}

				}
				
			}
			ans[i]=res;
		}
		return ans;
	}
	public static void update(int start,int end,Pair[] dp){
		Pair pair=new Pair(start,end);
		for(int i=start;i<=end;i++){
			dp[i]=pair;
		}
	}

}
