package BitManipulation;

//given a number n find its set bits
public class JP_07_SetBits {
    public static void main(String[] args) {
        int n = 2;
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                count++;
            n = n >> 1;
        }
        System.out.println(count);
    }
}
