package array;

public class StocksBuy_Sell_1 
{

	/**
	 * Given prices of stock on different days. Find maximum profit one can make if stock can be
	 * bought and sold once
	 */
	
	
	static int maxProfit(int prices[])
	{
		int min = prices[0] , max_profit = 0;
		for (int i = 1 ; i < prices.length ; i++)
		{
			if (prices[i] - min > max_profit) max_profit = prices[i] - min ;
			if (min > prices[i]) min = prices[i] ;
		}
		return max_profit ;
	}
	
	public static void main(String[] args) 
	{
		int prices[] = {10, 5, 20, 30, 7, 25, 10, 35} ;
		System.out.println(maxProfit(prices));
	}
}
