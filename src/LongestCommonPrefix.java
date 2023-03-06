import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder("");
        if (strs[0].equals("") || strs.length == 0)
            return "";
        int index = 0;
        boolean flag = false;

        for (int i = 0; i < 200; i++) { // char Index
            try {
                for (int j = 0; j < strs.length; j++) { // strings
                    if (strs[0].charAt(i) == strs[j].charAt(i))
                        flag = true;

                    else {
                        flag = false;
                        break;
                    }

                }
                if (flag)
                    prefix.append(strs[0].charAt(i));
            } catch (IndexOutOfBoundsException e) {
                break;
            }

        }
        return prefix.toString();
    }

    public static void main(String[] args) {
//        String strs[] = {"flower", "flow", "flight", "flat"};
        String strs[] = {"a"};
//      System.out.println((longestCommonPrefix(strs)));
        System.out.println((sortMethod(strs)));
    }

    private static String sortMethod(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;
        while (index < first.length() && index < last.length()) {
            if (first.charAt(index) != last.charAt(index))
                break;
            index++;
        }
        return strs[0].substring(0, index);
    }
}
