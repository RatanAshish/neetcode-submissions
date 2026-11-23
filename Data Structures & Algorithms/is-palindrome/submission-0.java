class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        char[] S=s.toCharArray();
        int l=0, r=S.length-1;
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