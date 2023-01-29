package week3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindAllEvenLengthBinarySequencesWithSameSumofFirstAndSecondHalfBits {
	static Set<Character>set=new HashSet();
	static Set<String>list;
	static int count=1;
	public static void method2() {
		int number=5;
		char[] ch=new char[number*2];
		rec(ch,0,number*2-1,0);
		
		
	}
	public static void rec(char[] ch,int start,int end,int dif) {
		if(Math.abs(dif)>end-start+1)
			return;
		if(start>end) {
			if(dif==0) {
				System.out.println(count+": "+new String(ch));
				count++;
				
			}
				
		}
		//start=0,end=0
		ch[start]='0';ch[end]='0';
		rec(ch,start+1,end-1,dif);
		//start=1,end=1;
		ch[start]='1';ch[end]='1';
		rec(ch,start+1,end-1,dif);
		ch[start]='0';ch[end]='1';
		rec(ch,start+1,end-1,dif+1);
		ch[start]='1';ch[end]='0';
		rec(ch,start+1,end-1,dif-1);
		
		
		
	}

	public static void method() {
		int count=1;
		int number=5;
		//00,10,
		for(int i=0;i<=number;i++) {
			String str="";
			for(int j=0;j<i;j++) {
				str+="1";
			}
			for(int j=0;j<number-i;j++) {
				str+="0";
				
			}
			list=new HashSet();
			printPermutations(str,0,str.length()-1);
			for(String s1:list) {
				for(String s2:list) {
					System.out.println(count+": "+s1+s2);
					count++;
				}
			}
			
		}
		System.out.println("end");
	}
	 private static void printPermutations(String string, int start, int end) {
	        if(start>=end) {
	        	list.add(string);
	            //System.out.println(string);
	            return;
	        }

	        for(int i=start; i<=end; i++) {
	            string = swap(string, start, i);
	            printPermutations(string, start+1, end);
	            string = swap(string, start, i);
	        }
	    }

	    private static String swap(String string, int start, int i) {
	        char[] charArray = string.toCharArray();

	        char temp = charArray[start];
	        charArray[start] = charArray[i];
	        charArray[i] = temp;

	        return String.valueOf(charArray);
	    }
}
