package problemSolving;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        if(stones.length == 0)
            return 0;

        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int item: stones) {
            maxheap.add(item);
        }
        int weight;
        // 2,7,4,1,8,1
        // 8,7,4,2,1,1
        //4,2,1,1,1
        //2,1,1,1
        //1,1,1
        while(!maxheap.isEmpty() && maxheap.size() >=2 ) {
            int first = maxheap.remove();
            int second = maxheap.remove();
            if(first != second && first >= second) {
                weight = first - second;
                maxheap.add(weight);
            }

        }

        return maxheap.isEmpty() ? 0: maxheap.remove();
    }

    public static void main(String[] args) {

        System.out.println(lastStoneWeight(new int[] {2,7,4,1,8,1}));
        System.out.println(lastStoneWeight(new int[] {1}));

    }
}
