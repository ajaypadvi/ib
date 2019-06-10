package level01.timecomplexity.math;

public class NESTED_CMPL3 {
    public static void main(String[] args) {
        int N = 6;
        int count = 0;
        for (int i = N; i > 0; i /= 2) {
            for (int j = 0; j < i; j++) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
