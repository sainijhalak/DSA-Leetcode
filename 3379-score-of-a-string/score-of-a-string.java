class Solution {
    public int scoreOfString(String s) {
    char [] n= s.toCharArray();
        int sum=0;
        for(int i=0;i<n.length-1;i++){
int j=n[i]-n[i+1];
if(j<0){
    j=j*-1;
}
sum=sum+j;
        }
        return sum;
    }
}