public class InterleavingStrings {
    public static void main(String[] args) {
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbcbcac"));//true
        System.out.println(isInterleave("aabcc", "dbbca", "aadbbbaccc"));//false
        System.out.println(isInterleave("", "", ""));//ture
        System.out.println(isInterleave("", "", "a"));//false
        System.out.println(isInterleave("a", "", "c"));//false
    }

    static boolean isInterleave(String s1, String s2, String s3) {
        int i = 0;
        int j = 0;
        int k = 0;
        if(k < s3.length()) {
            while (i < s1.length() && j < s2.length()) {
                if(s2.charAt(j) != s3.charAt(k) && s1.charAt(i) != s3.charAt(k)) {
                    return false;
                }
                while (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
                    i++;
                    k++;
                }
                while (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
                    j++;
                    k++;
                }

            }

        }
        if(s1.equals("") && s2.equals("") && s3.equals(""))
            return true;
        else         if(s1.length() + s2.length() != s3.length())
            return false;
        return k == s3.length() - 1 ? true : false;
    }

}
