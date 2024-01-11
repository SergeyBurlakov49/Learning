package leetcode.No121BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        int difference = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) max = prices[i];
            else if(prices[i] < min){
                max = prices[i];
                min = prices[i];
            }
            if ((max - min) > difference) difference = max - min;
        }
        return difference;
    }

    public static void main(String[] args) {
        new BestTimeToBuyAndSellStock().maxProfit(new int[]{1,2});
    }
}
