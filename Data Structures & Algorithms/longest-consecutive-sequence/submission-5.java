class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set <Integer> set = new HashSet <>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxlen = 1;
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            if(!set.contains(current-1)){ 
                int len = 1;
            while(set.contains(current+1)){
                current++;
                len++;
            }
            maxlen = Math.max(len,maxlen);

            }

        } return maxlen;
    }
}
