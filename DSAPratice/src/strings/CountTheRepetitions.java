package strings;

public class CountTheRepetitions {
	public static void main(String[] args) {
		//String s1
		int res=getMaxRepetitions("baba", 11, "baab", 1);
		System.out.println(res);
	}
	public static int getMaxRepetitions(String s1, int n1, String s2, int n2) {
		 int i=0,j=0,r1=0,r2=0;

	       
         

         while(i<s2.length()&&j<s1.length()){
         	 char ch=s2.charAt(i);
             if(ch==s1.charAt(j)){
                 i++;
                 j++;
             }else{
                 j++;
             }
             if(i==s2.length()){
             	r2++;
                 if(j==s1.length()) {r1++;break;}
                 else {
                     while(j<s1.length()){
                         if(s2.charAt(0)!=s1.charAt(j))j++;
                         else break;
                     }
                     if(j==s1.length()) {r1++;break;}
                     else
                     i=0;
                 }
                
                 
                 
             }
             if(j==s1.length()){
                 r1++;
                 j=0;
             }
             
         }
        // if(i==s2.length()) break;
     
     double r=(double)r1/r2;
     r =n2*r;
     double res= n1/r;
     return (int) (res);

	        
	    }

}
