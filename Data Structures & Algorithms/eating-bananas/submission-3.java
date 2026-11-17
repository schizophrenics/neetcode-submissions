class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int best = 0;
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > best){
                best = piles[i];
            }
        }

        
        // function above created 
        // 1 2 3 4 which are the hourly rates
        // we run a binary search with the values above
        // 

        int left = 1;
        int right = best;
        int mid = 0;

        int best_case = h; // doesn't mean the most optimal but given what we have this is the best
        // most optimal would make it equal to the hours given

        while(left <= right){
            mid = (left + right) / 2;
            
            long current = counter(piles, mid);
            
            if(current <= h){
                best_case = mid;
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return best_case;
    }

    // create a for loop on the piles 
    // 
    // divide each with the rate and add to the counter
    // return the full complation time
    //  

    // 
    public static long counter(int[] piles, int k){
        long counter = 0;
        for(int i = 0; i < piles.length; i++){
            counter += (long) Math.ceil((double) piles[i] / k);
        }

        return counter;
    } 
}
