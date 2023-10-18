class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> numset = new HashSet<Integer>();
        for(int num:nums){
            numset.add(num);
        }
        for(int i=0; i<=nums.length; i++){
            if(!numset.contains(i)){
                return i;
            }
        }
        return -1;
    }
}





//   2nd approach
        // Arrays.sort(nums);
        // for(int i=0; i<n; i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
//   3rd approach
        // int exceptedsum = n*(n+1)/2;
        // int actualsum=0;
        // for(int num:nums){
        //actualsum=actualsum+num; 
        // }
        // return exceptedsum-actualsum;