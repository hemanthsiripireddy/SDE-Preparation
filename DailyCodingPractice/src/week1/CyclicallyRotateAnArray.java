package week1;

public class CyclicallyRotateAnArray {
	public  static void method() {
		int[] arr=new int[] {1, 2, 3, 4, 5,6,7,8,9};
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
