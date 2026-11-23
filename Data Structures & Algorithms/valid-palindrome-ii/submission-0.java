class Solution {
    public boolean validPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        char[] S= s.toCharArray();
        int l=0, r=S.length-1;
        while(l<r){
            if(S[l]!=S[r]){
                return isPalindrome(S,l+1,r) || isPalindrome(S,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    private boolean isPalindrome(char[] S, int l, int r){
        while(l<r){
            if(S[l]!=S[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}