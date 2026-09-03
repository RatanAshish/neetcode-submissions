class Solution {
    public int search(int[] nums, int target) {
       int start= 0;
       int end= nums.length-1;
       int mid= start+(end-start)/2;

       while(start<=end){
        //compare target with midValue
        if(nums[mid]== target){
            //target found
            return mid;
        }
        else if(target>nums[mid]){
            //go to right side
            start= mid+1;
        }
        else{
        //(target<mid){
            //go to left side
            end= mid-1;
        }
        //update mid
        mid=start+(end-start)/2;
       } 
     //  if you reached at this point then your target will not found
     return -1;
    }
}

