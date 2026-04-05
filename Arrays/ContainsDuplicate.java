// Problem: Contains Duplicate
// Link: https://leetcode.com/problems/contains-duplicate/
// Approach: Use HashSet to track elements; if already present → duplicate found
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false; 
    }
}
