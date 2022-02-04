package com;

public class Sort {
    public static void main(String[] args) {
        int[] arr={7,4,10,8,3,1};
        int[] result=selectionSort(arr);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
    static int[] selectionSort(int nums[]) {
        int size = nums.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                if (nums[i] < nums[min_idx]) {
                    min_idx = i;
                }
            }
            int temp = nums[step];
            nums[step] = nums[min_idx];
            nums[min_idx] = temp;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=(nums[i]*nums[i]);
        }

        return nums;
    }
}
