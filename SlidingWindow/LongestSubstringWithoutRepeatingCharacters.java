// Problem: Longest Substring Without Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/
// Approach: Sliding Window with HashSet to maintain unique characters
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int n = s.length();
        int l = 0, r = 0;
        int maxlen = 0;

        while(r < n){
            if(!st.contains(s.charAt(r))) {
                st.add(s.charAt(r));
                maxlen = Math.max(maxlen, r - l + 1);
                r++;
            } else {
                st.remove(s.charAt(l));
                l++;
            }
        }
        return maxlen;
    }
}
