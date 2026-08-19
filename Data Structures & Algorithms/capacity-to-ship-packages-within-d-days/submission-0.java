class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for(int i=0;i<weights.length;i++){
            left = Math.max(weights[i],left);
            right += weights[i];
        }
        int ans = right;
        while(left<=right){
            int mid = left+(right - left)/2;
            int reqDays = 1;
            int currWeight = 0;
            for(int i=0;i<weights.length;i++){
                if(currWeight + weights[i]<=mid) currWeight += weights[i];
                else {
                    reqDays++;
                    currWeight = weights[i];
                }
            }
            if(reqDays<=days){
                ans = mid;
                right = mid - 1;
            }
            else left = mid + 1;
        }
        return ans;
        
    }
}