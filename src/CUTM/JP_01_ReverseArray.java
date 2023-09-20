package CUTM;

import java.util.Arrays;

public class JP_01_ReverseArray {
    public static void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++)   {
            char temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }

    public static void main(String[] args) {
        char[] arr={'u','n','i','r','s'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
}
