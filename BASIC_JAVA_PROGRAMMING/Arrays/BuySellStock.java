/*
 write a program of Buy Sell Stock, Logic is  Buy stock when Price is Low And sell It When Price is High and Make Profit
 Author:- Chirag Solanki.
 */



public class BuySellStock {

    public static int BuySell(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i =0;i<price.length;i++){
            if(buyprice < price[i]){
                int profit = price[i] - buyprice;   //current profit
                maxprofit = Math.max(maxprofit, profit); // Maximum Profit of All Time
            }else{
                buyprice = price[i]; //if current price is lower than buyprice so we should buy at that price
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {

    int price[] = {3,1,6,2,5,6}; //stock price

    System.out.println(BuySell(price));

    }

}