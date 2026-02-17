class Solution {
    public int maximumSum(int[] arr) {
        int nodelete=arr[0];
        int delete=Integer.MIN_VALUE;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            int pnd=nodelete;
            int pd=delete;
nodelete=Math.max(arr[i],arr[i]+nodelete);
if(delete==Integer.MIN_VALUE){
    delete=pnd;
}else{
     delete=Math.max(pnd,delete+arr[i]);
}
ans=Math.max(ans,Math.max(nodelete,delete));
        }
        return ans;
    }
}
