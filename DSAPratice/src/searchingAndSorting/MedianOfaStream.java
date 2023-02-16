package searchingAndSorting;

public class MedianOfaStream {
	static int[] arr= {1,4,2,3,6,5,9,0,12,-23,-2,23,45,123,-98};
	static double[] medians;
	static int[] sortedArr;
	static int size=0;
	public static void method() {
		medians=new double[arr.length];
		sortedArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			medians[i]=findMedian(i);
		}
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(sortedArr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<sortedArr.length;i++) {
			System.out.print(medians[i]+" ");
		}
		
		
	}
	private static double findMedian(int i) {
		// TODO Auto-generated method stub
		int val=arr[i];
		sortedArr[size++]=arr[i];
		int j=i;
		while(j>0&&sortedArr[j-1]>sortedArr[j]) {
			sortedArr[j]=sortedArr[j-1];
			
		}
		sortedArr[j]=val;
		if(size%2==0) {
			return (sortedArr[size/2]+sortedArr[size/2-1])/2.0;
		}else {
			return sortedArr[size/2];
		}
		
		
	}

}
