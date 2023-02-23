
public class CountAndSay {
    public static String countAndSay(int n) {

        return traverseSequence(n);

    }

    public static String traverseSequence(int n) {
        if (n == 1)
            return "1";
        String digitString = traverseSequence(n - 1);
        return getDigitString(digitString);
    }

    public static String getDigitString(String digitString) {

        StringBuilder result = new StringBuilder("");
        int prev = 0;
        int i = 0;
        for (; i < digitString.length(); i++) {
            if (digitString.charAt(i) != digitString.charAt(prev)) {
                result.append(Character.forDigit(i - prev, 10)).append(digitString.charAt(prev));
                prev = i;
            }
        }
        result.append(Character.forDigit(i - prev, 10)).append(digitString.charAt(prev));
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
    }
}
