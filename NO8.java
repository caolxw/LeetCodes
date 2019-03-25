class Solution {
    public int myAtoi(String str) {
        int re = 0;
        if (str.length() == 0) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {continue;}    //跳过开头的所有空格
            if (str.charAt(i) == '-') {
                str = str.substring(i);
                if (str.length() == 1) {
                    return 0;
                }
                i = 1;
                while (str.length() > i && 
                        str.charAt(i) >= '0' && str.charAt(i) <= '9') {i ++;}   //取到所有数字
                str = str.substring(0,i);
                for (int j = 1; j < str.length(); j++) {
                    if (re * (-1) < Integer.MIN_VALUE / 10 || 
                            re*(-1) == Integer.MIN_VALUE / 10 && 
                            str.charAt(j) > '8') {
                        return Integer.MIN_VALUE;
                    }else {
                        re = re * 10 + str.charAt(j) - '0';
                    }
                }
                re = (-1) * re;
                
            }else if (str.charAt(i) == '+') {
                str = str.substring(i);
                if (str.length() == 1) {
                    return 0;
                }
                i = 1;
                while (str.length() > i && 
                            str.charAt(i) >= '0' && str.charAt(i) <= '9') {i ++;}   //取到所有数字
                str = str.substring(0,i);
                for (int j = 1; j < str.length(); j++) {
                    if (re > Integer.MAX_VALUE / 10 || 
                            re == Integer.MAX_VALUE / 10 && 
                            str.charAt(j) > '7') {
                        re = Integer.MAX_VALUE;
                    }else {
                        re = re * 10 + str.charAt(j) - '0';
                    }
                }
            }
            else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                str = str.substring(i);
                i = 0;
                while (str.length() > i && 
                            str.charAt(i) >= '0' && str.charAt(i) <= '9') {i ++;}   //取到所有数字
                str = str.substring(0,i);
                for (int j = 0; j < str.length(); j++) {
                    if (re > Integer.MAX_VALUE / 10 || 
                            re == Integer.MAX_VALUE / 10 && 
                            str.charAt(j) > '7') {
                        re = Integer.MAX_VALUE;
                    }else {
                        re = re * 10 + str.charAt(j) - '0';
                    }
                }
            }else {
                re = 0;
            }
            break;
        
        }
        return re;
    }
}
