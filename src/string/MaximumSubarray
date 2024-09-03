class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i<n;i++){
            cs = cs + nums[i];
            ans = Math.max(ans,cs);
            if (cs<0) cs = 0;
        }
        return ans;
    }
}