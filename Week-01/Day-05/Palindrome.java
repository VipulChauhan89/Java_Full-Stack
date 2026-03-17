public class Palindrome {
    public static boolean palindrome(int n) {
        int temp = n, rev = 0;
        while(n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        if(temp == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 121;
        boolean isPalindrome = palindrome(number);
        if(isPalindrome)
        {
            System.out.println(number + " is a Palindrome number");
        } else {
            System.out.println(number + " is not a Palindrome number");
        }
    }
}
