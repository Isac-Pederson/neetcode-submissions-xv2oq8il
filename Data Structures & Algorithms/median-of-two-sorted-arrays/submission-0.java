class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int left = (nums1.length + nums2.length +1) / 2; //3
       int right = (nums1.length + nums2.length +2) / 2; //3.5
       return (getKth(nums1, nums1.length, nums2, nums2.length, left, 0, 0)
       +
            getKth(nums1, nums1.length, nums2, nums2.length, right , 0, 0)) / 2.0;
            }


    int getKth(int[] a, int aLen, int[] b, int bLen, int k, int aStart, int bStart){
        if(aLen > bLen){
            return getKth(b, bLen, a, aLen, k, bStart, aStart);
        }
        if(aLen == 0){
            return b[bStart + k -1];
        }
        if(k == 1){
            return Math.min(a[aStart], b[bStart]);
        }

        int i = Math.min(aLen, k /2);
        int j = Math.min(bLen, k/2);

        if(a[aStart + i - 1] > b[bStart + j - 1]){
            return getKth(a, aLen, b, bLen - j, k - j, aStart, bStart +j );
        }else{
            return getKth(a, aLen - i, b, bLen, k - i, aStart + i, bStart );
        }



    }

}
