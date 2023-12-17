package LeetCode;

public class Q_LongestPalindromeInString {
    public static String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        int low = 0, high = 0;
        int max = 0;
        String sub = "";
        //for odd
        for (int i = 1; i < s.length(); i++) {
            low = high = i;
            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                if(low==-1 || high==s.length())
                    break;
            }
            String palindrome=s.substring(low+1,high);
            if (palindrome.length()>sub.length()) {
                sub = palindrome;
            }
        }
        //for even
        for (int i = 1; i < s.length(); i++) {
            low = i - 1;
            high = i;
            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                if(low==-1 || high==s.length())
                    break;
                }
            String palindrome = s.substring(low + 1, high);
            if (palindrome.length() > sub.length()) {
                sub = palindrome;
            }
        }
        return sub;
    }

    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}

