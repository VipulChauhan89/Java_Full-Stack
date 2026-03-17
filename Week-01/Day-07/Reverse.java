public class Reverse {
    public static StringBuilder reverse(StringBuilder s) {
        int l = 0, r = s.length() - 1;
        while(l < r) {
            char c = s.charAt(l);
            s.setCharAt(l, s.charAt(r));
            s.setCharAt(r, c);
            l++;
            r--;
        }
        return s;
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("hello");
        s = reverse(s);
        System.out.println(s);
    }
}
