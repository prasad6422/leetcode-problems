class Solution {
    public int firstMissingPositive(int[] nums) {
        int firstmissing=1;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        while(set.contains(firstmissing)){
            firstmissing++;
        }
        return firstmissing;
    }
}