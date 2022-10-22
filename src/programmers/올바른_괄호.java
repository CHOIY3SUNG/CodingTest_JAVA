package programmers;
import java.util.*;

public class 올바른_괄호 {
    public static boolean main(String[] args) {
        String s = "()()";

        Stack<String> stack = new Stack<>();
        for(int i = 0; i<=s.length()-1; i++){
            if(s.charAt(i) == '('){
                stack.push(String.valueOf(s.charAt(i)));
            } else {
                if (stack.isEmpty()){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}