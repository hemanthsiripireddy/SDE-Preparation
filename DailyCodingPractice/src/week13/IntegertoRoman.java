package week13;

public class IntegertoRoman {
	public static void method() {
		String str=intToRoman(10);
		System.out.println(str);
	}
	  public static String intToRoman(int num) {
	        StringBuilder sb=new StringBuilder();
	        while(num>0){
	            if(num/1000>0){
	                add(sb,"M",num/1000);
	                num=num%1000;
	                
	            }else if(num/500>0){
	                int i=num/500;
	                if(num>=900){
	                    sb.append("CM");
	                   
	                }else {
	                    sb.append("D");
	                    add(sb,"C",(num-500)/100);
	                }
	                 num=num%100;
	            }
	            else if(num/100>0){
	                if(num>=400){
	                    sb.append("CD");

	                }else{
	                    add(sb,"C",num/100);
	                }
	                num=num%100;
	            }
	            else if(num/50>0){
	                if(num>=90){
	                    sb.append("XC");
	                   
	                }else {
	                    sb.append("L");
	                    add(sb,"X",(num-50)/10);
	                }
	                 num=num%10;

	            }
	            else if(num/10>0){
	                 if(num>=40){
	                    sb.append("XL");

	                }else{
	                    add(sb,"X",num/10);
	                }
	                num=num%10;

	            }else if(num/5>0){
	                 if(num>=9){
	                    sb.append("IX");
	                   
	                }else {
	                    sb.append("V");
	                    add(sb,"I",(num-5));
	                }
	                 num=num%1;

	            }else{
	                if(num==4){
	                    sb.append("IV");
	                }else{
	                    add(sb,"I",num);
	                }
	                num=num%1;
	            }
	        }
	        return new String(sb);
	        
	    }
	    public static  void add(StringBuilder sb,String ch,int num){
	        for(int i=0;i<num;i++){
	            sb.append(ch);
	        }
	    }

}
