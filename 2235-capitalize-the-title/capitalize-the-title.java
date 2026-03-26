class Solution {
    public String capitalizeTitle(String title) {
        String[] arr=title.toLowerCase().trim().split("\\s+");
        for(int i=0;i<arr.length;i++){
            String c=arr[i];
            if(c.length()>2){

            
            arr[i]=Character.toUpperCase(c.charAt(0))+c.substring(1,c.length());
        }
        }
        String n="";
        for(int i=0;i<arr.length-1;i++){
            n=n+arr[i]+" ";
        } 
        n=n+arr[arr.length-1];
        return n;
    }
}