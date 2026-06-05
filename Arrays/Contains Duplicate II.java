class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){     // making to store both the num and its index of the duplicate
                int prev = a.get(nums[i]);
                if(i-prev<=k){
                    return true;   
                }
            }
            a.put(nums[i],i);
        }
        return false;
    }
}
