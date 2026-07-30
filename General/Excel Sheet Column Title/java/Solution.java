1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder s=new StringBuilder();
4        while(columnNumber>0){
5            columnNumber--;
6            s.append((char)('A'+columnNumber%26));
7            columnNumber/=26;
8        }
9        return s.reverse().toString();
10    }
11}