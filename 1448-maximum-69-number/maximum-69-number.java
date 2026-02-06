class Solution {
    public int maximum69Number (int num) {
        int count=0;
        int n=num;
        while(n>0){
            n=n/10;
            count++;
        }
        int nn=num;
        int [] arr=new int[count];
        for (int i=count-1;i>=0;i--){
arr[i]=nn%10;
nn=nn/10;
        }
        for(int i=0;i<arr.length;i++){
           if(arr[i]==6){
            arr[i]=9;
            break;
           }

        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans*10+arr[i];
        }
        return ans;
    }
}