// ────────────────────────────────────────────────────────────
// Platform  : TUF
// Problem   : Command Palette
// Difficulty: Unknown
// Language  : java
// URL       : https://takeuforward.org/plus/dsa/problems/second-largest-element?subject=dsa&approach=optimal&tab=submissions
// Solved    : 2026-05-27T19:23:41.327Z
// ────────────────────────────────────────────────────────────

class Solution {
    public int secondLargestElement(int[] nums) {
    int n = nums.length;
    if(n < 2) {
      return -1;
    }
      Arrays.sort(nums);
      int largest = nums[n-1];
      int secondLargest = -1;
      for(int i = n-1;i>=0;i--) {
        if(nums[i] != largest) {
          secondLargest = nums[i];
          break;
        }
      