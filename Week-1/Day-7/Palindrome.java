public class Palindrome {
    public static String palindrome(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                return "Not palindrome";
            }
            l++;
            r--;
        }
        return "Palindrome";
    }

    public static void main(String[] args) {
        String s = "madam";
        String ans = palindrome(s);
        System.out.println(s + " is " + ans);
    }
}
