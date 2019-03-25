class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList();
        
        for(int i : nums1)
            list.add(i);
        for(int i : nums2)
            list.add(i);
        Collections.sort(list);
        Object[] arr = list.toArray();
        
        if(arr.length % 2 == 0){
            int index = arr.length / 2;
            int p = (int)arr[index - 1];
            int n = (int)arr[index];
            return (p+n) / 2.0;
        }else{
            int index = arr.length / 2;
            return (int)arr[index];
        }
    }
}