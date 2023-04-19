package problemSolving;

public class StringPool {

    public static void main(String[] args) {
        String s1  = "Apple";
        String s2  = "Apple";
        System.out.println("Address of s1 = "+ Integer.toHexString(s1.hashCode()) +  "\nAddress" +
                " of s2 = "+ Integer.toHexString(s2.hashCode()));
    }
}
