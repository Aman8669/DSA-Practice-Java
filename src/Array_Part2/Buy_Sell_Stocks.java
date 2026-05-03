package Array_Part2;



public class Buy_Sell_Stocks {
    public static int buySell(int[] prices){
        int buyingPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyingPrice < prices[i]){
                int profit = prices[i] - buyingPrice;
                MaxProfit = Math.max(profit , MaxProfit);
            } else {
                buyingPrice = prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Te maximum profit is the : "+buySell(prices));


    }
}
