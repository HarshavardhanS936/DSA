class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int ind=0;
        while(ind<s1.length()&&ind<s2.length){
            if(s1.charAt(ind)==s2.charAt(ind))ind++;
        }
        return s1.substring(0,ind);
    }
}
