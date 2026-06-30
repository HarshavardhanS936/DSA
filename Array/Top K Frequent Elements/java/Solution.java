class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        
        int n[]=new int[k];
        for(int i=0;i<k;i++){
            int max=0;
            int o=0;
            for(int j:hash.keySet()){
                if(max<hash.get(j)){
                    max=hash.get(j);
                    o=j;
                }
            }
              n[i]=o;
            hash.remove(o);
          
        }
        return n;
    }
}