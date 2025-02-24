package INDEXPACK;

public class INDEXFIND {
    public static String a;
    public static int b;

    public int index(String ac) {
        int le = ac.length();
        if (le == 11) {
            a = ac.substring(le - 1, le);
        } else if (le == 12) {
            a = ac.substring(le - 1, le);
        } else {
            System.out.println("    invalid a/c no");
        }

        b = Integer.valueOf(a);
        return b;
    }
}
