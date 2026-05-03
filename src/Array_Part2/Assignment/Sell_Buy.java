package Array_Part2.Assignment;

public class Sell_Buy {
    public static int buysell(int[] prices){
        int buyprice = Integer.MAX_VALUE;
        int MAxProfit = 0;

        for (int i = 0; i <prices.length ; i++) {
            if (buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                MAxProfit = Math.max(profit, MAxProfit);
            }else {
                buyprice = prices[i];
            }
            if (buyprice>prices[i]){
                return 0;
            }
        }
        return MAxProfit;
    }
    public static void main(String[] args) {
        int[] prices ={7,6,4,3,1};
        System.out.println(buysell(prices));
    }
}
