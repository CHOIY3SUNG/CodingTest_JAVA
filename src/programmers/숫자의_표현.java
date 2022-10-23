package programmers;

public class 숫자의_표현 {
    public static void main(String[] args) {
        int n = 15; // Test

        int answer = 0;
        for(int i = 1; i < n; i++) {
            int dummy = 0;
            for(int j = i; j <= n; j++) {
                if(dummy + j == n) {
                    answer++;
                    break;
                } else if (dummy > n) {
                    break;
                }
                dummy += j;
            }
        }

        System.out.println(answer + 1); // Test
    }
}
