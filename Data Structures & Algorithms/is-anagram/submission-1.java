
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        java.util.HashMap<Character,Integer> map = new java.util.HashMap<>();
        java.util.HashMap<Character,Integer> map1 = new java.util.HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)+1);
        }
        return map.equals(map1);
    }
}
