package problemSolving;

/*
Find sum of numbers present in input

Output - 8
 */
public class SumOfNumbers {

    public static void main(String[] args) {
        String input = "1ab34c";

        int sum = 0;
        for(int i=0; i<input.length(); i++) {
            char letter = input.charAt(i);
            if(Character.isDigit(letter)) {
                sum += Character.getNumericValue(letter);

            }
        }

        System.out.println("Sum of numbers : "+sum);

    }
}
