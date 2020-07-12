package mediun;
/*
* 对于一个给定数组 {6, 7, 8, 0, 1, 2, 3, 4, 5}，
* 它是将一个有序数组的前三位旋转地放在了数组末尾。
* 假设输入的 target 等于 0，则输出答案是 4，即 0 所在的位置下标是 4。如果输入 3，则返回 -1。
* */
public class M_33_SearchInRotated {

    public static void main(String[] args) {

        int [] arr = {6, 7, 8, 0, 1, 2, 3, 4, 5};
        try {

            M_33_SearchInRotated m_33_searchInRotated = new M_33_SearchInRotated();
            System.out.println(m_33_searchInRotated.searchInRotated(10, arr, 0, arr.length -1));
        } catch (Exception e) {
            System.out.println(-1);
        }
    }

    private static int searchInRotated(int target, int[] arr, int start ,int end) {

        int mid = (start + end)/2;
        if (target == arr[mid]){
            return mid;
        }
        if (arr == null || arr.length == 0) {
            return -1;
        }
//        划分一侧是有序数组时
        if (arr[start] <= arr[mid -1]) {
            if (arr[start] <= target && target <= arr[mid - 1]) {
                return searchInRotated(target, arr, start, mid - 1);
            } else {
                return searchInRotated(target, arr, mid +1, end);
            }
        } else {
            if (arr[mid +1] <= target && target <= arr[end]) {
                return searchInRotated(target, arr, mid +1, end);
            }
            else {
                return searchInRotated(target, arr, mid -1, end);
            }
            }

    }
}
