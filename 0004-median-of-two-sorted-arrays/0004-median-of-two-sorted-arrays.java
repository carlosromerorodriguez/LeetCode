class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, res, 0, nums1.length);
        System.arraycopy(nums2, 0, res, (nums1.length), nums2.length);

        Arrays.sort(res);

        if (res.length % 2 != 0) { // medida impar del array
            return res[res.length / 2];
        }

        return (((double) res[res.length / 2] + res[res.length / 2 - 1]) / 2);
    }
}