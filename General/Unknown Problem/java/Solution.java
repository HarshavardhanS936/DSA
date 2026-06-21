1class Solution {
2    public List<List<Integer>> combinationSum(int[] nums, int target) {
3        List<List<Integer>> ans=new ArrayList<>();
4        sub(0,nums,target,ans,new ArrayList<>());
5        return ans;
6    }
7    public static void sub(int index,int nums[],int target,List<List<Integer>> ans,List<Integer> temp){
8        if(target==0){
9            ans.add(new ArrayList<>(temp));
10            return;
11        }
12        if(target<0)return;
13        for(int i=index;i<nums.length;i++){
14            temp.add(nums[i]);
15            sub(i,nums,target-nums[i],ans,temp);
16            temp.remove(temp.size()-1);
17        }
18    }
19}