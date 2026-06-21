1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> ans=new ArrayList<>();
4        sub(0,nums,ans,new ArrayList<>());
5        return ans;
6    }
7    public static void sub(int index,int nums[],List<List<Integer>> ans,List<Integer> temp){
8        if(index==nums.length){
9            ans.add(new ArrayList<>(temp));
10            return;
11        }
12        temp.add(nums[index]);
13        sub(index+1,nums,ans,temp);
14        temp.remove(temp.size()-1);
15        sub(index+1,nums,ans,temp);
16    }
17}