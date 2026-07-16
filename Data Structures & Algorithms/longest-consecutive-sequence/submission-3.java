class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlen = 0;
        for(int i=0;i<nums.length;i++){
            int current = nums[i];
            int len = 1;
            boolean found = true;
            while(found){
                found = false;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]== current + 1){
                        len++;
                        current++;
                        found = true;
                        break;
                    }
                }

            }
            maxlen = Math.max(len,maxlen);
        } return maxlen;
    }
}
