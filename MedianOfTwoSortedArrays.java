class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length+ nums2.length];

        for (int i=0,j=0;i< nums1.length;i++){
            nums3[j] = nums1[i];
            j++;
        }

        for (int i=0,j= nums1.length;i< nums2.length&&j< nums3.length;i++){
            nums3[j] = nums2[i];
            j++;
        }
        Arrays.sort(nums3);

        if (nums3.length%2!=0){
            int index = nums3.length/2;
            return nums3[index];
        }
        int index1 = (nums3.length/2)-1;
        int index2 = index1+1;

        return (double)(nums3[index2]+nums3[index1])/2;
    }
}
