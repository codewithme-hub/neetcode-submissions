class Solution {
    public int maxArea(int[] heights) {
       int i=0;
       int j = heights.length - 1;
       int max = 0;
       while(i<j){
          int h = Math.min(heights[i],heights[j]);
          int w = j-i;
          int area = w * h;
          if(area>max){
            max = area;
          }
          if(heights[i]<heights[j]) i++;
          else j--;
       } 
       return max;
    }
}

