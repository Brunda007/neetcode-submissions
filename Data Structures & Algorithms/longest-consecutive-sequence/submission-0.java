class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
           set.add(nums[i]);
        }
        int count=0;
        int maxLen = 0;
        for(int i:nums){
            if(!set.contains(i-1)){
                count = 1;
            while(set.contains(i+1)){
                count++;
                i++;
            }
            }
            maxLen = Math.max(count,maxLen);
        }
  return maxLen;  }
}
