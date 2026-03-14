public class CountVowels {
    public static boolean check(char c) {
        char ch = Character.toLowerCase(c);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
            return true;
        }
        return false;
    }
    
    public static int count(String s) {
        int n = s.length() - 1, ans = 0;
        for(int i = 0; i < n; i++) {
            if(check(s.charAt(i))) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "education";
        int ans = count(s);
        System.out.println("Count of vowels in " + s + " is  = " + ans);
    }
}
