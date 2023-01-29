package week4;

public class StockBuyandSell {
	public static void method() {
		//4, 2, 2, 2, 4
		int[] prices=new int[] {1,2,3,4,5,6};
		int maxProfit=0;
        int curProfit=0;
        int start=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]-start<curProfit){
                maxProfit+=curProfit;
                start=prices[i];
                curProfit=0;
            }else{
                curProfit=prices[i]-start;
            }

        }
         maxProfit+=curProfit;
         System.out.println(maxProfit);
        
         
	}


}
