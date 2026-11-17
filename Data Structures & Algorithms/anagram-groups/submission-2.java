class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        ArrayList<List<String>> result = new ArrayList<>();

        // "act" = {"act", "cat"}
        Map<String, List<String>> map = new HashMap<>();
        
        for(String word : strs){
            String key = sortedString(word);

            if(map.containsKey(key)){
                map.get(key).add(word);
            }
            else{
                // local array but we create a reference in the hashmap so it lasts and doesn't get collected by garbage collector 
                ArrayList<String> array = new ArrayList<>();
                array.add(word);
                map.put(key, array);
            }
        }
        
        // map.values() allows us to get each ArrayList
        // we can convert ArrayList to List not vice versa
        for(List<String> value : map.values()){
            result.add(value);
        }

        return result;
        
        
        
        }


    public static String sortedString(String word){
        
        // turn String to char array
        char[] char_array = word.toCharArray();

        // sort the characters
        Arrays.sort(char_array);

        // turn the char array to String
        String sorted = new String(char_array);

        // return the word
        return sorted;

    }
}
