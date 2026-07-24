1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        List<Integer> list=new ArrayList<>();
4        for(int i:nums1)list.add(i);
5        for(int i:nums2)list.add(i);
6        Collections.sort(list);
7        double n=list.size()/2;
8        if(list.size()%2!=0)return list.get((int)n);
9        else return (list.get((int)n)+list.get((int)n-1))/2.0;
10    }
11}