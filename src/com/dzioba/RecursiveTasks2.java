package com.dzioba;

public class RecursiveTasks2 {

    public boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length){
            return target == 0;
        }
        return groupSum(start+1, nums, target-nums[start])
                || groupSum(start+1, nums, target);
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if(start == nums.length)
            return target == 0;

        int currentNum = nums[start];

        if(currentNum == 6){
            return groupSum6(start+1, nums, target - currentNum);

        }
        return groupSum6(start + 1, nums, target - currentNum) ||
                groupSum6(start + 1, nums, target);

    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if(target == 0)
            return true;
        if(start >= nums.length)
            return false;
        int currentNum = nums[start];
        return groupNoAdj(start + 2, nums, target - currentNum) ||
                groupNoAdj(start + 1, nums, target);
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if(start == nums.length)
            return target == 0;

        int currentNum = nums[start];
        int numModulo = currentNum % 5;

        if(numModulo == 0){
            if(start < nums.length - 1 && nums[start+1] == 1)
                return groupSum5(start+2, nums, target - currentNum);
            return groupSum5(start+1, nums, target - currentNum);

        }
        return groupSum5(start + 1, nums, target - currentNum) ||
                groupSum5(start + 1, nums, target);

    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if(start >= nums.length) {
            return target == 0;
        }
        int i = start;
        for(;  i < nums.length && nums[start] == nums[i]; i++);
        return groupSumClump(i, nums, target - ((i - start) * nums[start])) ||
                groupSumClump(i, nums, target);

    }




    public boolean splitArray(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    private boolean helper(int[] nums, int index, int first, int second) {
        if(nums.length == 0)
            return true;
        if(index == nums.length)
            return first == second;

        return helper(nums, index + 1, first + nums[index], second) ||
                helper(nums, index + 1, first, second + nums[index]);

    }





    public boolean splitOdd10(int[] nums)
    {	return helper(0, 0, nums, 0);	}


    private boolean helper(int first, int second, int[] nums, int i)
    {
        if(i == nums.length)
            return (first % 2 == 1
                    && second % 10 == 0
                    || second % 2 == 1
                    && first % 10 == 0);
        return helper(first + nums[i], second, nums, i + 1) ||
                helper(first, second + nums[i], nums, i + 1);
    }




    public boolean split53(int[] nums)
    {	return helper(nums, 0, 0);	}

    private boolean helper(int[] nums, int index, int balance)
    {
        if(index == nums.length)
            return (balance == 0);
        if(nums[index] % 5 == 0)
            return helper(nums, index + 1, balance + nums[index]);
        if(nums[index] % 3 == 0)
            return helper(nums, index + 1, balance - nums[index]);
        return helper(nums, index + 1, balance + nums[index]) ||
                helper(nums, index + 1, balance - nums[index]);
    }
}
