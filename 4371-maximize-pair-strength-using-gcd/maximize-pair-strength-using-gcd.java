class Solution {
    long gcdNikalo(long a, long b){
        long g=0;
    
            while(b!=0){
            long m=a%b;
            a=b;
            b=m;
            }
            g=a;
        
        return g;
    }
    public long maxPairStrength(int[] nums) {
        long asn=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                  long c=1L*nums[i]*nums[j];
                   long gg=gcdNikalo(nums[i],nums[j]);
                   long gcd=gg*gg;
                   long k=c/gcd;
                    if(k>asn){
                        asn=k;
                    }
            }
        }
        return asn;
    }
}