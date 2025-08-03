class Solution {
    public int longestOnes(int[] nums, int k) {
        
        //sliding windows - use sliding windows, keep count on 0's in window. if count zeroes >  k , move left pointer to reduce 0's. track max window size
        //time complexity: O(n)
        //space complexity: O(1)
        int zeroes = 0, maxLength = 0, left = 0, right = 0;
        for(right = 0; right < nums.length; right++){
            if(nums[right] == 0)
                zeroes++;    

                while(zeroes > k){
                    if(nums[left] == 0)
                        zeroes--;
                    left++;
                }
                maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
