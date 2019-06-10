package level01.timecomplexity.math;

public class NESTED_CMPL2 {
    public static void main(String[] args) {
        int N = 6;
        int a = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = N; j > i; j--) {
                a = a + i + j;
                count++;
            }
        }
        System.out.println(count);
    }
}
