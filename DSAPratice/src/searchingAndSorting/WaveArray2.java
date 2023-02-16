package searchingAndSorting;

public class WaveArray2 {
	public static void method() {
		int[] arr= {1,2,5,4,-1,-8,-2,6,-30,-6};
		waveArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void waveArray(int[] arr) {
		// TODO Auto-generated method stub
		int foundMisplace=-1,i=0;
		while(i<arr.length) {
			if(foundMisplace==-1) {
				if(i%2==0&&arr[i]>=0)
					foundMisplace=i;
				if(i%2==1&&arr[i]<0)
					foundMisplace=i;
				i++;
			}else {
				if(foundMisplace%2==0&&arr[i]<0) {
					shift(arr,foundMisplace,i);
					i=foundMisplace+2;
					foundMisplace=-1;
				}
				else if(foundMisplace%2==1&&arr[i]>=0) {
					shift(arr,foundMisplace,i);
					i=foundMisplace+2;
					foundMisplace=-1;
					
				}else
					i++;
			}
		}
		
	}

	private static void shift(int[] arr, int foundMisplace, int i) {
		// TODO Auto-generated method stub
		int val=arr[i];
		while(i!=foundMisplace) {
			arr[i]=arr[i-1];
			i--;
		}
		arr[i]=val;
		
	}

}
