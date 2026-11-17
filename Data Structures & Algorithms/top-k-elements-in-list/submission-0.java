class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //
        // map 
        // fill the map with counts
        //
        // sort into an array
        // 
        // this solution would work but takes too much space
        

        // another solution
        // 
        // sort the array
        // keep a best counter 
        // keep a counter for the current value
        // 
        // increment as you go until a change
        // compute the best case when there is a change
        // 
        
        // 1 2 2 3 3 3  target is first 2
        // 3 2 
        int[] result = new int[k];


        HashMap<Integer, Integer> map = new HashMap<>();
        // 1 1
        // 2 2
        // 3 3

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<Map.Entry<Integer, Integer>> entryArray = new ArrayList<>(map.entrySet());
        // [Entry1, Entry2]
        // Entry1 = 1:1
        // Entry2 = 2:2

        entryArray.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        for(int i = 0; i < k; i++){
            result[i] = entryArray.get(i).getKey();
        }

        return result;



        // 
    }
}
