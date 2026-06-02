class Solution{
    public int[] twoSum(int []nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){ //a+b=sum
                    return new int[]{i,j}; //returning its index
                }
             
            }
        }
           return new int[]{-1,-1}; ///return if not found
    }
    
}

