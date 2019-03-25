class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> result = new ArrayList();
        int count = 0;
        char[] cs = s.toCharArray();
        for(int i = 0; i < cs.length; i ++){
            result.add(cs[i]);
            for(int j = i+1; j<cs.length; j++){
                if(result.indexOf(cs[j]) != -1)
                    break;
                result.add(cs[j]);
            }
            if(result.size() > count)
                count = result.size();
            result.clear();
        }
        
        return count;
    }
}