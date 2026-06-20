class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        // List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> ans=new HashSet<>();
        sub(0,nums,target,ans,new ArrayList<>());
        return new ArrayList(ans);
    }
    public static void sub(int index,int nums[],int target,Set<List<Integer>> ans,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0)return;
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            sub(i+1,nums,target-nums[i],ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}