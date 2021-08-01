package toolcode.goodmethod;

/**
 * 最优路径，
 * 一个矩形中选择和最小的一条路径
 * dp[i][j] = min(dp[i-1][j] + dp[i][j-1]) + arr[i][j]
 * 初始值 ：
 *      dp[0][0] = arr[0][0];
 *      dp[0][j] = dp[0][j - 1] + arr[0][j];
 *      dp[i][0] = dp[i - 1][0] + arr[i][0];
 */
public class BestWay {

    public int uniquePaths(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        if (m <= 0 || n <= 0) {
            return 0;
        }
        int[][] dp = new int[m][n];
        dp[0][0] = arr[0][0];
        for (int i = 1 ; i < m; i ++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }
        for (int i = 1; i < n; i ++) {
            dp[0][i] = dp[0][i-1] + arr[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j ++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j - 1]) + arr[i][j];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] arr= {{1, 2, 3}, {3, 2, 1}, {3, 2, 1}};
        System.out.println(new BestWay().uniquePaths(arr));
    }

    /**
     * 给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数
     * @return
     */
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1+1][n2+1];
        // dp[0][0,1,...n2]
        for (int i = 1; i <= n2; i ++) {
            dp[0][i] = dp[0][i - 1] + 1;
        }
        // dp[0,1,...n1][0]
        for (int i = 1; i <= n2; i ++) {
            dp[i][0] = dp[i - 1][0] + 1;
        }
        // 通过公式 推出 dp[n1][n2]
        for (int i = 1; i <= n1; i ++) {
            for (int j = 1; j <= n2; j ++) {
                //如果 word1[i] 与 word2[j]相等。第i个字符对应的i-1
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[n1][n2];
    }
}
