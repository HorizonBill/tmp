# tmp
parameterFile

放置软件启动指令或者参数设置文件

# 动态规划 算法总结
1.构建dp二维数组（一般场景都是二维的）
2.归纳模型 dp[i][j] 与 dp[i-][j] 或 dp[i][j-1] 之间的关系
  一般由后往前推导，从规模小的场景，推导到大的场景；
3。初始化值的设定 dp[0][0], dp[0][j], dp[i][0]

