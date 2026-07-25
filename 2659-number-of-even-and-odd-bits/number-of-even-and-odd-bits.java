class Solution {
    public int[] evenOddBit(int n) {
        String binary = Integer.toBinaryString(n);
        char [] ans=binary.toCharArray();
        int k=0;
        int l=ans.length-1;
        while(k<l){
            char temp=ans[k];
            ans[k]=ans[l];
            ans[l]=temp;
            k++;
            l--;
        }
        int e=0;
        int o=0;
        for(int i=0;i<ans.length;i++){
            if(i%2==0 && ans[i]=='1') e++;
            else if(i%2!=0 && ans[i]=='1') o++;
        }
        return new int[]{e,o};
    }
}