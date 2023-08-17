package math;

public class LargestTriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points={{35,-23},{-12,-48},{-34,-40},{21,-25},{-35,-44},{24,1},{16,-9},{41,4},{-36,-49},{42,-49},{-37,-20},{-35,11},{-2,-36},{18,21},{18,8},{-24,14},{-23,-11},{-8,44},{-19,-3},{0,-10},{-21,-4},{23,18},{20,11},{-42,24},{6,-19}}
;
		double res= largestTriangleArea(points);
		System.out.println(res);
		

	}
	public static double largestTriangleArea(int[][] points) {
        int n=points.length;
        double res=0;

         for(int i=0;i<n;i++){
             int[] p1=points[i];
             for(int j=i+1;j<n;j++){
                 int[] p2=points[j];
                 for(int k=j+1;k<n;k++){
                     int[] p3= points[k];
                     double a=Math.sqrt(Math.pow(p1[0]-p2[0],2)+Math.pow(p1[1]-p2[1],2));
                       double b=Math.sqrt(Math.pow(p1[0]-p3[0],2)+Math.pow(p3[1]-p1[1],2));
                         double c=Math.sqrt(Math.pow(p3[0]-p2[0],2)+Math.pow(p2[1]-p3[1],2));
                         double s=0;
                         if(a+b+c!=0)
                          s=((a+b+c)/2.0);
                         
                        	 double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
                             System.out.println(i+" "+j+" "+k);
                             System.out.println(area);
                             res=Math.max(res,area);
                       

                 }
             }
         }
         return res;
        
    }

}
