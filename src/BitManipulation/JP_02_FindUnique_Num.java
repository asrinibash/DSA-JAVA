package BitManipulation;

public class JP_02_FindUnique_Num {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2, 4, 6, 4,};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {

        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
