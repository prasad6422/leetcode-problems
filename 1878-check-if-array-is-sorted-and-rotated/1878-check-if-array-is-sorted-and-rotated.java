class Solution {
    public boolean check(int[] nums) {
        int t=0, n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>nums[(i+1) % n]){
                t++;
            }
            if(t>1){
                return false;
            }
        }
        return true;
    }
}