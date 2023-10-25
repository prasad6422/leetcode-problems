class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        Set<Integer> set = new TreeSet<Integer>();

        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                set.add(nums[i]);
            }else{
                hm.put(nums[i],nums[i]);
            }
        }
        for(int s:set){
            list.add(s);
        }
        return list;
    }
}