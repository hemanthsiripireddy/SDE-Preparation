package trie;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
	public static void method() {
		int n=9;
		List<Integer>res=lexicalOrder(n);
		for(int i:res)
			System.out.print(i+" ");
	}
	static class Trie{
        int num;
        Trie[] arr=new Trie[11];
        public Trie(int n){
            num=n;
        }
    }
   static  List<Integer>res=new ArrayList<>();

    public static List<Integer> lexicalOrder(int n) {
        Trie trie=new Trie(34);

        for(int i=1;i<=n;i++){
            int c=findCount(i);
            int[] arr=new int[c];
           findDigits( i,arr);
           int j=0;
           Trie cur=trie;
           while(j<arr.length){
            Trie temp=   cur.arr[arr[j]];
            if(temp==null)
            cur.arr[arr[j]]=new Trie(arr[j]);

            cur=cur.arr[arr[j]];
            j++;
           }
        }
        Trie cur=trie;
        int i=1;
        while(cur.arr[i]!=null){
            compute(cur.arr[i],cur.arr[i].num);

            i++;
        }
        return res;
    }
    public static void compute(Trie trie,int num){
        res.add(num);
        int i=0;
        while(trie.arr[i]!=null){
            compute(trie.arr[i],num*10+trie.arr[i].num);
            i++;
        }
    }
    public static int findCount(int n){
        int c=0;
        while(n>0){
            c++;
            n=n/10;


        }
        return c;
    }
    public static  void findDigits(int n,int[] arr){
        for(int i=arr.length-1;i>=0;i--){


            arr[i]=n%10;
            n=n/10;
        }
    }

}
