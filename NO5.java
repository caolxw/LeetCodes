class Solution {
	public String longestPalindrome(String s){
		if(s.length() == 0){return "";}

		String result = s.charAt(0)+"";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				String temp = s.substring(i, j+1);
				boolean mark = true;
				if(temp.length() % 2 == 0) {
					int index = temp.length() / 2;
					for (int k = index; k < temp.length(); k++) {
						if (temp.charAt(k) != 
							temp.charAt(temp.length()-1-k)) {
							mark = false;
							break;
						}
					}
				}else {
					int index = temp.length() / 2;
					for (int k = index+1; k < temp.length(); k++) {
						if (temp.charAt(k) != 
							temp.charAt(temp.length()-1-k)) {
							mark = false;
							break;
						}
					}
				}					
				if(mark) {
					if (result.length() < temp.length())
						result = temp;
				}
			}
		}
		return result;       
	}
}