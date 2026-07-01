class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int zerocount=0;
        int maxlen=0;
        for( int right=0;right<s.length();right++)
        {
            if(s.charAt(right)=='A') {zerocount++;}
            while(zerocount > k)
            {
                if(s.charAt(left)=='A') {zerocount--;}
                left++;
            }maxlen=Math.max(maxlen,right-left+1);
           
        }
        return maxlen;
    }
}