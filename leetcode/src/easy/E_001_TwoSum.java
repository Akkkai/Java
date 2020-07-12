package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
给定一个整数数组和一个目标值，找出数据中和为目标值的2个数。
arr={1,2,3,4},target = 4
* */
public class E_001_TwoSum {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        E_001_TwoSum e_001_twoSum = new E_001_TwoSum();
        System.out.println(Arrays.toString(e_001_twoSum.twoSum(arr, 4)));
    }

    public int[] twoSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= arr.length; i++ ){
            if (map.containsKey(target - arr[i])) {
                return new int[] {map.get(target - arr[i]), i};
            }
            map.put(arr[i], i);
        } throw new IllegalArgumentException("没有");
    }
}
