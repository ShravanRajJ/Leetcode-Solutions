// Problem: Product of Array Except Self
// Link: https://leetcode.com/problems/product-of-array-except-self/
// Approach: Use prefix (left) and suffix (right) products without division
// Time Complexity: O(n)
// Space Complexity: O(1) (excluding output array)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 1;
        for(int i = 0; i < n; i++){
            if(i > 0) left *= nums[i - 1];
            ans[i] = left;
        }

        int right = 1;
        for(int i = n - 1; i >= 0; i--){
            if(i < n - 1) right *= nums[i + 1];
            ans[i] *= right;
        }

        return ans;
    }
}
