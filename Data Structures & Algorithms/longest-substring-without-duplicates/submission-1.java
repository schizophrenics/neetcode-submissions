class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
            Sliding Window solution

            keep track of a window
            with left and right

            calculate the best with each new element from the string

            create a hashset to store elements
            add if it is new
            substract till you reach that previous element and resize your window

            z x y z t


            Hashmap Solution

            startingPoint = 0

            each new element has 2 cases:
            1-> duplicate
            2-> completely new

            if it is the 1st
            then; what we could do is change the starting point

            if it is the 2nd
            then; it will grow the selected window

        */
        int start = 0;
        int best = 0;

        HashMap<Character, Integer> lastSeenAt = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (!lastSeenAt.containsKey(current)) {
                lastSeenAt.put(current, i);
            } else {
                start = Math.max(start,lastSeenAt.get(current) + 1);
                lastSeenAt.put(current, i);
            }
            best = Math.max(best, i - start + 1);
        }

        return best;
    }
}
