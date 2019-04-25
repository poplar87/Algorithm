    public static String removeSpace(StringBuffer str) {
        int spacenum=0;
            int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==' ')spacenum++;
            }
        int indexOld=str.length()-1;
        
        int newLength=str.length()+2*spacenum;
        int indexNew=newLength-1;
        str.setLength(newLength);
        for(;indexOld>=0&&indexNew>=0;){
            if(str.charAt(indexOld)==' '){
                    str.setCharAt(indexNew--,'0');
                    str.setCharAt(indexNew--,'2');
                    str.setCharAt(indexNew--,'%');
                }
            else{
                    str.setCharAt(indexNew-- ,str.charAt(indexOld));
                }
           indexOld--;
            }
        return new String(str);
        }
