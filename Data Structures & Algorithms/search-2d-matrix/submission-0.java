class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        int start= 0;
        int end= m*n-1;
        //Binary Search
        while(start<=end){
            int mid= start+(end-start)/2;
            int val= matrix[mid/n][mid%n]; 
            if(val== target){
                return true;
            } else if(val<target){
                start=mid+1;
            } else {
                end= mid-1;
            }
       }
       return false;
    }
}
