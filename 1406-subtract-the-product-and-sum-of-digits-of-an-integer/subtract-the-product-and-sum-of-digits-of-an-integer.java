class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int mul=1;
        int num=n;
        while(num>0){
            int a=num%10;
            sum=sum+a;
            mul=mul*a;
            num=num/10;
        }
        return (mul-sum);
    }
}