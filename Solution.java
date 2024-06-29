class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> temp = new HashMap<>();
        Set<Character> inp = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char c = t.charAt(i);
            if(temp.containsKey(ch)){
                char out = temp.get(ch);
                if(out != c) return false;
            }else{
                if(inp.contains(c)){
                    return false;
                }
                temp.put(ch, c);
                inp.add(c);
            }
        }
        return true;
    }
}
