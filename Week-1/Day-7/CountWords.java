public class CountWords {
    public static int count(String s) {
        int n = s.length(), ans = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "Java is powerful";
        int ans = count(s);
        System.out.println("Count of words = " + ans);
    }
}
