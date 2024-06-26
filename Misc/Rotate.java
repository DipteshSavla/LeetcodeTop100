class Rotate {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        if (k == 0) {
            return;
        }

        int i = 0;
        int j = nums.length - 1;

        while ( i < j ) {
            swap(nums, i++, j--);
        }

        i = 0;
        j = k - 1;
        while (i < j) {
            swap(nums, i++, j--);
        }

        i = k;
        j = nums.length - 1;
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}