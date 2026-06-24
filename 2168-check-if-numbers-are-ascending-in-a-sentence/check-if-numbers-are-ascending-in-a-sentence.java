class Solution {
    public boolean areNumbersAscending(String s) {
        String [] arr=s.trim().split(" ");
        int prev=-1;
        for(int i=0;i<arr.length;i++){
            
            if(Character.isDigit(arr[i].charAt(0))){
                int num = Integer.parseInt(arr[i]);
                if(prev>=num) return false;
                else{
                    prev=num;
                }
            }
           
        }
        return true;
    }
}