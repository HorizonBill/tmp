package toolcode.goodmethod;

/**
 * 动态规划
 */
public class DynamicStyle {

    public static void main(String[] args) {
        DynamicStyle dynamicStyle= new DynamicStyle();
        //正则表达式
        boolean b = dynamicStyle.isMatch("a", "a*");
        System.out.println(b);

        //方格中行走的路线条数
        System.out.println(dynamicStyle.wakeMethod(7, 3));
    }
    public boolean isMatch(String s, String p){
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m+1][n+1];
        f[0][0] = true;
        for (int i = 0; i <= m; ++i ){
            for (int j = 1; j <=n; ++ j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i,j - 1)) {
                        f[i][j] = f[i][j] || f[i-1][j];
                    }
                }else {
                    if (matches(s, p, i , j)) {
                        f[i][j] = f[i-1][j-1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }

    /*
    一个矩形框中，机器人从起点出发，走到右下角有几种走法（只能往右或下两个方向）
     */
    public int wakeMethod(int m, int n){
        if (m<=0 || n<=0){
            return 0;
        }
        int dp[][] = new int[m][n];
        //只往右这个方向走
        for (int i = 0; i < m; i ++) {
            dp[i][0] = 1;
        }
        //只往下这个方向走
        for (int i = 0; i < n; i ++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i ++){
            for (int j = 1; j < n; j ++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
