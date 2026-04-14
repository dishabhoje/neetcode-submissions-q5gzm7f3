class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            int index = str.indexOf(String.valueOf(t.charAt(i)));
            if(index!=-1){
                str.deleteCharAt(index);
            }else return false; 
        }
       if(str.length()>0)return false;
        return true;
    }
}
