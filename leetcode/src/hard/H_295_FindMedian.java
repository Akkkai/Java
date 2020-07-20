package hard;

import java.util.LinkedList;
import java.util.PriorityQueue;

/*
* 中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。
* 例如，
* [2,3,4]的中位数是3.
* [2，3]的中位数是(2+3)/2=2.5
*
* 设计一个支持以下两种操作的数据结构：
*       void addNum(int num) - 从数据流中添加一个整数到数据结构中。
*       double findMedian() - 返回目前所有元素的中位数。
*
* */
public class H_295_FindMedian {
    int count = 0;
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));

    public static void main(String[] args) {
        H_295_FindMedian h = new H_295_FindMedian();
        h.addNum(1);
        h.addNum(2);
        h.addNum(10);
        h.addNum(20);
        h.addNum(22);
        h.addNum(40);
//        添加终止插入
        h.addNum(-1);
    }

    private void addNum(Integer num) {
//        判断终止插入位置
        if(-1 == num){
            System.out.println(H_295_FindMedian.findMedian());
        }
        if (count%2 == 0) {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        } else {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        count++;
    }

    private static double findMedian() {
        if(maxHeap.size() > minHeap.size()){
            return maxHeap.peek();
        } else {
            return (maxHeap.peek() + minHeap.peek())/2.0;
        }
    }
}
