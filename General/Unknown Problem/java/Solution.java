1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> list=new ArrayList<>();
4        boolean visit[]=new boolean[nums.length];
5        per(nums,visit,list,new ArrayList<>());
6        return list;
7    }
8    public void per(int nums[],boolean visit[],List<List<Integer>> list,List<Integer> temp){
9        if(temp.size()==nums.length){
10            list.add(new ArrayList<>(temp));
11            return;
12        }
13        for(int i=0;i<nums.length;i++){
14            if(!visit[i]){
15                visit[i]=true;
16                temp.add(nums[i]);
17                per(nums,visit,list,temp);
18                temp.remove(temp.size()-1);
19                visit[i]=false;
20            }
21        }
22    }
23}