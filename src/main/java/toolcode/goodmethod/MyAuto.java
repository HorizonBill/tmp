package toolcode.goodmethod;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义自动化流程，然后逐一判断，按照设定的流程执行
 */
public class MyAuto {

    class Automaton {
        public int sign = 1;
        public long ans = 0;
        private String state = "start";
        //定义判断字符的流程 刚开始 为 空格 start
        // 之后 出现的 符号 signed
        //只有出现数字才继续，其他的都结束
        private Map<String, String[]> table = new HashMap<String, String[]>() {{
            put("start", new String[]{"start", "signed", "in_number", "end"});
            put("signed", new String[]{"end", "end", "in_number", "end"});
            put("in_number", new String[]{"end", "end", "in_number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }};

        /*
        获取字符，转化为数据，并判断处理数据的范围
         */
        public void get(char c) {
            state = table.get(state)[get_col(c)];
            if ("in_number".equals(state)) {
                ans = ans * 10 + c - '0';
                ans = sign == 1 ? Math.min(ans, (long) Integer.MAX_VALUE) : Math.min(ans, -(long) Integer.MIN_VALUE);
            } else if ("signed".equals(state)) {
                sign = c == '+' ? 1 : -1;
            }
        }

        /*
        空格定义为 0
        数字符号定义 1
        数字定义  2
        其他未 3
         */
        private int get_col(char c) {
            if (c == ' ') {
                return 0;
            }
            if (c == '+' || c == '-') {
                return 1;
            }
            if (Character.isDigit(c)) {
                return 2;
            }
            return 3;
        }
    }
}
