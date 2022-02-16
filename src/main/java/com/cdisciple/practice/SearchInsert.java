package com.cdisciple.practice;
//Variation of Binary sort
//Finds the target number in a sorted array in ascending order.
// If the target does not exist return the index where it should have been placed in the sorted array.
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(target > nums[mid]){low = mid + 1;}
            else if(target < nums[mid]){high = mid - 1;}
            else if(target == nums[mid]){return mid;}

        }
        return low;
    }
}
