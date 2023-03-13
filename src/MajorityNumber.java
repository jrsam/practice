/*
"A path in a binary tree is a sequence of nodes where each pair of
 adjacent nodes in the sequence has an edge connecting them.
 A node can only appear in the sequence at most once.
 Note that the path does not need to pass through the root.

The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path."
 */
/*
traverse(root) {
        if(root != null) {


        }
}
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
 */
public class Tree {
    public static void main(String[] args) {
        Integer[] input = new Integer[]{1, 2, 1};

        List<Integer> list = Arrays.asList(input);
        Collections.sort(list);

        int count = 0;
        int majoritySize = input.length/2;
        int prev = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (prev != list.get(i)) {
                if (count > (majoritySize)) {
                    System.out.println(prev);
                    break;
                }else
                    count = 0;
            } else {
                prev = list.get(i);
                count += 1;
            }
        }


    }


}
// sarvesh.joshi@freshworks.com