class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:salary){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        int count=0;
        int sum=0;
      
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=min && salary[i]!=max){
                sum= sum+salary[i];
                count++;
            }
        }
        double avg=(double)sum/count;
        return avg;
    }
}