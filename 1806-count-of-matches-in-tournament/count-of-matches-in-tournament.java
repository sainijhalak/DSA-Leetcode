class Solution {
    public int numberOfMatches(int n) {
        if(n==1) return 0;
        int teams=n;
        int matches=0;
        while(teams>2){
            if(teams%2==0){
                matches=matches+(teams/2);
                teams=teams/2;
            }
            else{
                matches=matches+((teams-1)/2);
                teams=((teams-1)/2)+1;
            }
        }
        return matches+1;
    }
}