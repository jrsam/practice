package problemSolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
convert string array to integers and omit the non-intgers
 */
public class ConvertStringArrayToIntegers {
    public static void main(String[] args) {
        String[] arr = {"3", "1", "2", "xyz"};

        List<Integer> result2 = Arrays.stream(arr).map(val -> {
            try {
                return Integer.parseInt(val);
            } catch (NumberFormatException numberFormatException) {
                return null;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).filter(value -> value != null).collect(Collectors.toList());
        for (Integer value :
                result2) {
            System.out.println(value);
        }
    }
}
