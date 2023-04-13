package problemSolving;

/*
Input String:
The paint color is red. The wall color is yellow.

The paint color is red. The wall color is yellow. The paint color is red.
The wall color is yellow. The paint color is red. The wall color is yellow.

Output String:
The paint color is RED. The wall color is YELLOW.
 */
public class ReplaceString {
    public static void main(String[] args) {

        String input2 = "The paint color is red. The wall color is yellow. The paint color is red.\n" +
                "The wall color is yellow. The paint color is red. The wall color is yellow.";

        System.out.println(input2.replaceAll("red", "RED").replaceAll("yellow", "YELLOW"));

    }
}
