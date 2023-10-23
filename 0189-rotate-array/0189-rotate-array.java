class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            temp[(i+k)%nums.length]=nums[i];
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=temp[i];
        }





        // int[] temp = new int[nums.length];
        // int c=0;
        // for(int i=k; i<nums.length; i++){
        //     temp[c]=nums[i];
        //     c++;
        // }
        // for(int i=0; i<k; i++){
        //     temp[c]=nums[i];
        //     c++;
        // }
        // for(int i=0; i<nums.length; i++){
        //     nums[i]=temp[i];
        // }
        
    }
}