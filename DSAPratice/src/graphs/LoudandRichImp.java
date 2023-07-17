package graphs;

public class LoudandRichImp {
	public static void method() {
		int[][] richer= {{1,0},{2,1},{3,1},{3,7},{4,3},{5,3},{6,3}};
		int[] quiet= {3,2,5,4,6,1,7,0};
		LoudandRich l=new LoudandRich();
		
		
		int[] res=l.loudAndRich(richer, quiet);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
