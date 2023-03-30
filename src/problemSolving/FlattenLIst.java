package problemSolving;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class FlattenLIst {
    public static void main(String[] args) {

        List<Object> input = asList(1, 2, 3, asList(4, 5), asList(6, 7, asList(8, 9, asList(10, 11))));
        //input - [1,2,3, [4,5], [6,7, [8,9, [10,11]]]]
        //- output [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
        List<Integer> output = flatten(input);
        System.out.println("---------Output--------");
        output.forEach(value -> {
            System.out.println(value);
        });

    }

    static List<Integer> flatten(List<Object> input) {

        List<Integer> output = new ArrayList<>();

        input.forEach(val -> {
            if (val instanceof Integer) {
                output.add((int) val);

            } else if (val instanceof List) {
                List<Integer> result = flatten((List<Object>) val);
                result.forEach(res -> {
                    output.add(res);
                });
            }
        });
        return output;
    }
}
