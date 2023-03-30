package problemSolving;

public class Palindrome {

       static public boolean isPalindrome(String s) {
            StringBuilder original = new StringBuilder( s.replaceAll("[^A-Za-z0-9]","").toLowerCase() );
            for(int i=0,j=original.length()-1;i<original.length()/2;i++,j--){
                if(original.charAt(i) != original.charAt(j))
                    return false;
            }
            return true;
        }
        static public boolean isPalindrome2(String s) {
           StringBuilder builder = new StringBuilder();
           s.chars().filter(c -> Character.isLetterOrDigit(c))
                   .mapToObj(c ->  Character.toLowerCase((char)c))
                   .forEach(builder::append);
           return builder.toString().equals(builder.reverse().toString());
        }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome2("race a car"));
    }

}
