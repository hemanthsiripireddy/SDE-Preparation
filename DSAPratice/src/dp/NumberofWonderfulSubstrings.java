package dp;

public class NumberofWonderfulSubstrings {
	public static void main(String[] args) {
		Solution s=new Solution();
		long res=s.wonderfulSubstrings("aba");
		System.out.println(res);
	}
	
}
class Solution {
    // even-even=even
    //odd -odd=even
    //even-odd=odd
    long res=0;
    int[] charCount=new int[10];
        int[] dp=new int[1025];
    public long wonderfulSubstrings(String word) {
        dp[1024]=1;
        
        
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int index=ch-'a';
            charCount[index]++;
            compute(index,1,0);

            int val=calcValue(0);
            dp[val]++;

        
            

        }
        return res;
        
    }
    public int calcValue(int index){
        if(index==10)
        return 1;
        if(charCount[index]%2==0)
        return 2*calcValue(index+1);
        else
        return calcValue(index+1);
    }
    public void compute(int index,int curVal,int odds){
        if(index==10){
        	
            res+=dp[curVal];
            return;
        }
         // even-even=even
        //odd -even=odd
        //odd-odd=even
        //even-odd=odd
        if(charCount[index]%2==0){
                
                compute(index+1,curVal*2,odds);


            }else{
                compute(index+1,curVal,odds);


            }
        if(odds==0){
            if(charCount[index]%2==0){
               
                compute(index+1,curVal,1);


            }else{
                compute(index+1,curVal*2,1);


            }

        }

    }
}