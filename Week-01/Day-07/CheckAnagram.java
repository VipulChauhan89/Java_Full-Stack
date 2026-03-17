public class CheckAnagram {
    public static String check(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if(n1 != n2) {
            return "Not Anagram";
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i = 0; i < n1; i++) {
            count1[Character.toLowerCase(s1.charAt(i)) - 'a']++;
            count2[Character.toLowerCase(s2.charAt(i)) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(count1[i] != count2[i]) {
                return "Not Anagram";
            }
        }
        return "Anagram";
    }

    public static void main(String[] args) {
        String s1 = "listen", s2 = "silent";
        String ans = check(s1, s2);
        System.out.println(s1 + " and " + s2 + " are " + ans);
    }
}
