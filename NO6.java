class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {return s;}
        
        int a = 2 * numRows - 2;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			if (i % numRows == 0 || (i+1) % numRows == 0) {
				for (int j = i; j < s.length(); j+=a) {
					sb.append(s.charAt(j));
				}
			}else {
				for (int j = i; j < s.length(); j+=a) {
					sb.append(s.charAt(j));
					if ((j + a - (j % a) * 2) >= s.length()) {
						continue;
					}
					sb.append(s.charAt(j + a - (j % a) * 2));
				}
			}
		}
		
        return sb.toString();
        
    }
}
