package problemSolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
 */
public class MajorityNumber {
    public static void main(String[] args) {
//        Integer[] input = new Integer[]{1, 1,1,2,2,2,2,2,2,2,2,2,2, 1};
        Integer[] input = new Integer[]{1,2, 1};

        List<Integer> list = Arrays.asList(input);
        Collections.sort(list);
        int count = 0;
        int majoritySize = input.length/2;
        for (int i = 0; i < list.size()-1; i++) {
            count+=1;
            if (list.get(i) != list.get(i+1)) {
                if (count > (majoritySize)) {
                    System.out.println("majority element "+list.get(i));
                    return;
                }else
                    count = 0;
            }
        }
        System.out.println(list.get(list.size()-1));

    }


}
// sarvesh.joshi@freshworks.com