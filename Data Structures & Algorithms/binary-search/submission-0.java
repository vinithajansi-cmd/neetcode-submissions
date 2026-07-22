class Solution {
    public int search(int[] nums, int target) {

        int result = binarySearch(nums,target,0,nums.length-1);
        return result;
    }
        private static int binarySearch(int[] nums, int target, int left, int right) {

        
        if(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]<target)
            return binarySearch(nums, target, mid+1,right);
            else if (nums[mid]>target)
            return binarySearch(nums,target,0,mid-1);


        }

        return -1;  
          


    }
}
