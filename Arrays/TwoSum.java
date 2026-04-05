// Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Approach: Store elements in HashMap and check if (target - current element) exists
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
