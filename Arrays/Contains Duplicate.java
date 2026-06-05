class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> a=new HashSet<>();
       for( int num:nums){
        if(a.contains(num)){ // If see that element existing 
            return true;
        }
        a.add(num); //adding the next element to set
    
       }
       return false;
    }
}
