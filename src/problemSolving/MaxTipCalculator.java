package problemSolving;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Difference implements Comparable<Difference> {
    int difference;
    int index;

    public Difference(int difference, int index) {
        this.difference = difference;
        this.index = index;
    }

    @Override
    public int compareTo(Difference o) {
        return this.difference - o.difference;
    }
}
public class MaxTipCalculator {


    static int findMaxTip(int[] ai, int[] bi, int n, int x, int y) {
        int maxTip = 0;
        List<Difference> differenceList = new ArrayList<>();
        for(int i=0; i<n; i++) {
            differenceList.add(new Difference(Math.abs(ai[i] - bi[i]), i));
        }
        Collections.sort(differenceList);

        for(int i=0; i<differenceList.size(); i++) {
            int index = differenceList.get(i).index;
            if(ai[index] >= bi[index] && x > 0 & n > 0) {
                maxTip += ai[index];
                n--;
                x--;
            } else if(y > 0 && n > 0) {
                n--;
                maxTip += bi[index];
                y--;
            }
        }

        return maxTip;
    }

    public static void main(String[] args) {
        System.out.println(findMaxTip(new int[]{1, 2, 3, 4, 5}, new int[] {5, 4, 3, 2, 1}, 5, 3, 3));
    }
}
