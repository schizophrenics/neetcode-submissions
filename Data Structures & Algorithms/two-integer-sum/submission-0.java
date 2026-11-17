class Solution {
    public int[] twoSum(int[] nums, int target) {
        // there is two different solutions that are good time wise

        // value -> index
        Map<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            int current = nums[i];
            int check = target - current;

            if(map.containsKey(check)){
                result[0] = map.get(check);
                result[1] = i;     

                return result;  
            }

            map.put(current, i);
        }

        return result;

    
    }
}
