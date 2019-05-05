public int myAtoi(String str) {
        if(str==null||str.length()<=0)return 0;
        char[] str1=str.toCharArray();
          int sign = 1, base = 0, i = 0;
    while (i<str1.length&&str1[i] == ' ') { i++; }
    if (i<str1.length&&(str1[i] == '-' || str1[i] == '+')) {
        sign = 1 - 2 * (str1[i++] == '-'?1:0); 
    }
    while (i<str1.length&&str1[i] >= '0' && str1[i] <= '9') {
        if (base >  Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str1[i] - '0' > 7)) {
            if (sign == 1) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
        base  = 10 * base + (str1[i++] - '0');
    }
    return base * sign;
    }
