class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int length_s = s.length();
        int length_t = t.length();

        if(length_s != length_t){
            return false;
        }

        for(int i = 0; i < length_s; i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            /*
            map.put(s.charAt(i), map.getOrdefault(s.charAt(i), 0)+1);
            */
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < length_t; i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }
            else if(map.get(t.charAt(i)) == 0){
                return false;
            }
            else{
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }
        }
        return true;
    }
}
