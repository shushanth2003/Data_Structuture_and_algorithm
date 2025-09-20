public class Buystock {
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        int ans=buyStock(prices);
        System.out.println(ans);
    }
    public static int buyStock(int[] prices){
        int maxPrice=0;
        int minPrice=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int price=prices[i];
            minPrice=Math.min(minPrice,price);
            int profit=price-minPrice;
            maxPrice=Math.max(profit,maxPrice);
        }
        return maxPrice;
    }
}
