import java.util.ArrayList;
import java.util.List;

public class BeautifulNumber {
    public static void main(String[] args) {
        int l=31;
        int r = 32;
        l=7;r=7;
        System.out.println(sumOfBeautifulNumbersBetween(l,r));

    }

    private static int sumOfBeautifulNumbersBetween(int l, int r) {
        int sum;
        int result = 0;
        boolean flag = false;

        for(int i=l; i<=r; i++) {
            sum =0;
            int temp=l;
            while(temp!=1) {
                try {
                    temp = sum(temp);
                    flag = true;
                }
                catch(StackOverflowError error) {
                    flag=false;
                    break;
                }

            }
            if(flag)
                result = result+i;
        }
        return result;
    }
    static int sum(int val) {
        List<Integer> result = new ArrayList<>();
        int temp = val;
        while(temp>0) {
            int rem = temp%10;
            result.add(rem);
            temp = (temp-rem)/10;
        }
        int total = 0;
        for(int i=0; i<result.size(); i++) {
            total = total + (result.get(i) *result.get(i));
        }
        return total;
    }
}
