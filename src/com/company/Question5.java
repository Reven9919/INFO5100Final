package com.company;

import java.util.Arrays;

class Question5 {
    public int findKthLargest(int[] nums, int k){
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len - k];
    }
}
