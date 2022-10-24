package programmers;
import java.util.*;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> citations = new ArrayList<>(
                Arrays.asList(3, 0 ,6, 5, 1));

        int answer = 0;
        while(true) {
            for(int i = 0; i <= citations.size(); i++) {
                System.out.println(citations.get(i));
            }
            break;
        }
    }
}
