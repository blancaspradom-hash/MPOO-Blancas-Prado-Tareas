import java.io.*;
import java.util.*;

class Result {
    public static int missingTreasure(int[] coins) {
        Arrays.sort(coins);
        int res = 1;
        for (int c : coins) {
            if (c > res) break;
            res += c;
        }
        return res;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            System.out.println(1);
            return;
        }
        String[] values = line.trim().split("\\s*,\\s*");
        int[] coins = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            coins[i] = Integer.parseInt(values[i]);
        }
        System.out.println(Result.missingTreasure(coins));
    }
}
