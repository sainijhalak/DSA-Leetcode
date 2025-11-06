class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         String a="";
         String b="";
        for(int i=0;i<word1.length;i++){
            a=a+word1[i];
        }
         for(int i=0;i<word2.length;i++){
            b=b+word2[i];
        }
    char [] c= a.toCharArray();
    char [] d= b.toCharArray();
    if(c.length!=d.length){
        return false;
    }
    for(int i=0;i<c.length;i++){
        if(c[i]!=d[i]){
            return false;
        }
    }
    return true;
    }
}