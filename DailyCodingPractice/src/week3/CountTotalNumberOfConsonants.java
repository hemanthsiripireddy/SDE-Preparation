package week3;

public class CountTotalNumberOfConsonants {
	public static void method() {
		String str="geeksforgeeks portal";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(isConsonant2(ch))
				count++;
			
		}
		System.out.println(count);
	}
	private static boolean isConsonant(char ch) {
		if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
			return true;
		return false;
	}
	private static boolean isConsonant2(char ch) {
		if((ch>65&&ch<69)||(ch>69&&ch<73)||(ch>73&&ch<79)||(ch>79&&ch<85)||(ch>85&&ch<=90)||(ch>97&&ch<101)||(ch>101&&ch<105)||(ch>105&&ch<111)||(ch>111&&ch<117)||(ch>117&&ch<=122))
			return true;
		return false;
	}
	//a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z

}
