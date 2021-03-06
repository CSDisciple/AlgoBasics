package com.cdisciple.practice;

public class BinarySearch {
    public int search(int []nums, int target){
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = (high + low)/2;
            System.out.println("Mid "+mid);
            if(target > nums[mid]){
                low = mid + 1;

            }else if(target < nums[mid]){
                high = mid - 1;
            }else if(target == nums[mid]){
                return mid;
            }
        }
        return -1;
    }
}
