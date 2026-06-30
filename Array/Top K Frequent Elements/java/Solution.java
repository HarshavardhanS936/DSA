class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            int key=0;
            int max=Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()>max){
                    max=entry.getValue();
                    key=entry.getKey();
                }
            }
            arr[i]=key;
            map.remove(key);
        }
        return arr;
    }
}