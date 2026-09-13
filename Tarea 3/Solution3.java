import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'isStableRoute' function below.
     *
     * The function is expected to return a BOOLEAN.
     * The function accepts STRING route as parameter.
     */

    public static boolean isStableRoute(String route) {
        Stack<Character> stack = new Stack<>();

        for (char c : route.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) return false;
        }

        return stack.isEmpty();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String route = bufferedReader.readLine();

        boolean result = Result.isStableRoute(route);
        bufferedWriter.write(Boolean.toString(result));

        bufferedReader.close();
        bufferedWriter.close();
    }
}
