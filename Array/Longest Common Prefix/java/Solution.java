class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int ind=0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(ind)==s2.charAt(ind))ind++;
            }
        }
        return s1.substring(0,ind);
    }
}
