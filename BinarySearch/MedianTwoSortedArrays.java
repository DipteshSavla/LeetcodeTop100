class MedianTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        int m1 = 0;
        int m2 = 0;

        for (int c = 0; c <= (nums1.length + nums2.length) / 2; c++) {
            m2 = m1;
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    m1 = nums1[i++];
                } else {
                    m1 = nums2[j++];
                }
            } else if (i < nums1.length) {
                m1 = nums1[i++];
            } else if(j < nums2.length) {
                m1 = nums2[j++];
            }
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            return (m1 + m2) / 2.0;
        } else {
            return m1 * 1.0;
        }
    }

  
}