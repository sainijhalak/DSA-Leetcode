class Solution {
    static String a;
    static boolean ans;
    void generate(String s,int c,List<String> num){
        if(!ans || c<0) return;
        if(c==0 && ans){
            if(!num.contains(s)){
                a=s;
                ans=false;
                return;
            }
        }
        generate(s+'0',c-1,num);
        generate(s+'1',c-1,num);
    }
    public String findDifferentBinaryString(String[] nums) {
        List<String> num=new ArrayList<>();
        a="";
        ans=true;
        for(int i=0;i<nums.length;i++){
            num.add(nums[i]);
        }
        int c=nums[0].length();
        generate("",c,num);
        return a;
    }
}