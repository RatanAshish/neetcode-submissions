class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set= new HashSet<>();
        int l=0, r=0;
        while(r<nums.length){
            if(set.contains(nums[r])){
                return true;
            }
            set.add(nums[r]);
            if(r-l>=k){
                set.remove(nums[l]);
                l++;
            }
            r++;
        }
        return false;
    }
}