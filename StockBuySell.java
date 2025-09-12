package DAY8;

public class StockBuySell {
  public static int buySell(int[] array) {
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;

    for (int i = 0; i < array.length; i++) {
      minPrice = Math.min(minPrice, array[i]);
      maxProfit = Math.max(maxProfit, array[i] - minPrice);
    }

    return maxProfit;
  }

  public static void main(String[] args) {
    int[] prices = { 5, 6, 2, 4, 9 };
    System.out.println(buySell(prices));
  }

}
