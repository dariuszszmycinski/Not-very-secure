public class SecureTester {

    public static boolean alphanumeric(String s) {
        if (s.length()==0) return false;
        for (char c : s.toCharArray()) {
            if ((c<48)||(c>57&&c<65)||(c>90&&c<97)||(c>122)) return false;
        }
        return true;
    }
}