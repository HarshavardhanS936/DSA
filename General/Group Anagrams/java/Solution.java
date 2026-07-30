1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String,List<String>> ans=new HashMap<>();
4        for(String s:strs){
5            char[] c=s.toCharArray();
6            Arrays.sort(c);
7            String k=new String(c);
8            if(!ans.containsKey(k)) ans.put(k,new ArrayList<>());
9            ans.get(k).add(s);
10        }
11        return new ArrayList<>(ans.values());
12    }
13}