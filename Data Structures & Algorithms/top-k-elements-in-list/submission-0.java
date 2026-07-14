class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      boolean [] visited = new boolean [nums.length];
      ArrayList <Integer> elem = new ArrayList<>();
      ArrayList <Integer> freq = new ArrayList<>();
      for(int i=0;i<nums.length;i++){
        if(visited[i]) continue;
        int count =0;
        for(int j=0;j<nums.length;j++){
            if( nums[i]==nums[j] && !visited[j]){
                count++;
                visited[j] = true;
            }
        }
        elem.add(nums[i]);
        freq.add(count);
      }
      int [] ans = new int[k];
      for(int i=0;i<k;i++){
        int maxFreq = -1;
        int maxIdx = -1;
        for(int j=0;j<freq.size();j++){
            if(freq.get(j)>maxFreq){
                maxFreq = freq.get(j);
                maxIdx = j;
            }
        }
        ans[i] = elem.get(maxIdx);
        freq.set(maxIdx,-1);
      } 
      return ans; 
    }
}
