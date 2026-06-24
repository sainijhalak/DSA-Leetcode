class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = 1;
        int sum = 0;
        int ans = 0;
        
        while (j < height.length) {
            if (height[j] < height[i]) {
                sum = sum + height[j];
                j++;
            } else if (height[j] >= height[i]) {
                int n = Math.min(height[i], height[j]);
                int m = n * (j - i - 1) - sum;
                ans = ans + m;
                sum = 0;
                i = j;
                j++;
            }
            
           
            if (j == height.length) {
               
                if (i < height.length - 1) {
                   
                    int c = i + 1; 
                    for (int m = i + 1; m < height.length; m++) {
                        if (height[m] > height[c]) {
                            c = m;
                        }
                    }
                    
                    
                    if (height[c] > 0) {
                    
                        sum = 0;
                        for (int k = i + 1; k < c; k++) {
                            sum = sum + height[k];
                        }
                        
                        int n = Math.min(height[i], height[c]);
                        int m = n * (c - i - 1) - sum;
                        if (m > 0) ans = ans + m;
                        
                        i = c;
                        j = i + 1;
                        sum = 0;
                        
                    } else {
                        
                        break;
                    }
                }
            }
        }
        
        return ans;
    }
}