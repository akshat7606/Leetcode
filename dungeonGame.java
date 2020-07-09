import java.util.Arrays;

class dungeonGame{
    public static int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        dp[n - 1][m] = 1;
        dp[n][m - 1] = 1;

        for (int i = n-1 ; i >= 0 ; i--) {
            for (int j = m-1 ; j >= 0; j--) {
                int sum = Math.min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j];

                if (sum <= 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = sum;
                }

            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] dungeon = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
        System.out.println(dungeonGame.calculateMinimumHP(dungeon));
    }
}