public class ClimbingStair {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    // Test cases
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int result1 = solution.climbStairs(2);
        System.out.println("Test case 1: " + result1);  // Output should be 2

        // Test case 2
        int result2 = solution.climbStairs(3);
        System.out.println("Test case 2: " + result2);  // Output should be 3
    }
}
