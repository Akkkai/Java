package easy;

/*
* 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
* 注：不能使用额外的数组空间。即空间复杂度为O(1).
* 例如：nums = [0,0,1,1,1,2,2,3,3,4]
* 输出：长度为5，原数组修改为[0,1,2,3,4]
*
* */
public class E_026_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        //保存去重数组的最大值
        int temp = nums[0];
        int len = 1;

        for (int i = 1; i<nums.length; i++) {
            if (nums[i] != temp) {
                nums[len] = nums[i];
                temp = nums[len];
                len++;
            }
        }
        System.out.println(len);
        for (int i=0; i<len; i++){
            System.out.println(nums[i]);
        }
    }
}
