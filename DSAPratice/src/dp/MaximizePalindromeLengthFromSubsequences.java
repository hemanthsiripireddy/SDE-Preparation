package dp;

import java.util.HashSet;
import java.util.Set;

public class MaximizePalindromeLengthFromSubsequences {
	
	public static void main(String[] args) {
		String word1="ab";
		String word2="ab";
		int res=longestPalindrome(word1, word2);
		System.out.println(res);
	}
	 static Set<String>word1Set=new HashSet<>();
    static  Set<String>word2Set=new HashSet<>();
 public static int longestPalindrome(String word1, String word2) {
     int res=0;
     compute1(new StringBuilder(),0,word1);
     compute2(new StringBuilder(),0,word2);
     for(String str:word1Set){
        
         if(word2Set.contains(str)){
             int cur=2*str.length();
             if(cur!=0)
             cur++;
             res=Math.max(res,cur);
         }
     }
     return res;
   

     
 }
 public static void compute1(StringBuilder sb,int index,String word1){
     if(index==word1.length())
     return ;
     compute1(sb,index+1,word1);
     sb.append(word1.charAt(index)+"");
     String str=new String(sb);
     word1Set.add(str);
     compute1(sb,index+1,word1);
     sb.deleteCharAt(sb.length()-1);
 }
  public static void compute2(StringBuilder sb,int index,String word1){
     if(index==word1.length())
     return ;
     compute2(sb,index+1,word1);
     sb.append(word1.charAt(index)+"");
     
     String str=new String(sb);
     str=reverse(str);
     word2Set.add(str);
     compute2(sb,index+1,word1);
     sb.deleteCharAt(sb.length()-1);
 }
 public static String reverse(String str){
     char[] chArray=str.toCharArray();
     int i=0,j=str.length()-1;
     while(i<j){
         char temp=chArray[i];
         chArray[i]=chArray[j];
         chArray[j]=temp;
         i++;
         j--;
     }
     return new String(chArray);
 }
}


