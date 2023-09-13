package DSA_Sheet_ApnaCollege.String;

//Leetcode-125 no question
public class JP_01_isPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder builder=new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch))
                builder.append(Character.toLowerCase(ch));
        }
        String filterString=builder.toString();
        String reverseString=builder.reverse().toString();
        return filterString.equals(reverseString);
    }
}
