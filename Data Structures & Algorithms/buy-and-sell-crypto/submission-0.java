class Solution {

    // 10 1 5 6 7 1 
    // 10 2 5 1 2 3

    // first loop through  the array

    // start two variables left and right from the start

    // if the current one is less then left assign that to left
    // if the current one is bigger than left and higher than result assing right to that

    public int maxProfit(int[] prices) {

        int left= 0;
        int right = 0;

        int result = 0;

        int current= 0;
        while(current < prices.length){
        
            if(prices[current] < prices[left]){
                left = current;
            }
            else if(prices[current] > prices[left]){
                right = current;
                
                int distance = prices[right] - prices[left];
                if(distance > result){
                    result = distance;
                }
            }

            current++;    
        }
        return result;
    }
}
