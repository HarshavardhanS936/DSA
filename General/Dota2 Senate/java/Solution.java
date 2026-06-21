1class Solution {
2    public String predictPartyVictory(String senate) {
3        Queue<Integer> r=new LinkedList<>();
4        Queue<Integer> d=new LinkedList<>();
5        int n=senate.length();
6        for(int i=0;i<n;i++){
7            if(senate.charAt(i)=='R')r.offer(i);
8            else d.offer(i);
9        }
10        while(!r.isEmpty()&&!d.isEmpty()){
11            int ri=r.poll();
12            int di=d.poll();
13            if(ri<di)r.offer(ri+n);
14            else d.offer(di+n);
15        }
16        if(r.isEmpty()) return "Dire";
17        else return "Radiant";
18    }
19}