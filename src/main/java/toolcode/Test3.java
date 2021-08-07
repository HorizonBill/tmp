package toolcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Test3 {

    private static Map<Integer, String> map = new HashMap<>();
    static{
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");
    }
    private static Map<Character, Character> characterMap = new HashMap<>();
    static {
        characterMap.put('[', ']');
        characterMap.put('(', ')');
        characterMap.put('{', '}');
    }

    public static void main(String[] args) {

//        System.out.println(new Test3().myAtoi("+12") );
//        int[] height = {1, 4, 5, 4, 1};
//        System.out.println(new Test3().maxArea(height));
//        System.out.println(new Test3().intToRoman(3));
        System.out.println(new Test3().isValid("[][({})]{}"));
    }

    public int myAtoi(String str){
        Automaton automaton = new Automaton();
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            automaton.get(str.charAt(i));
        }
        return (int) (automaton.sign * automaton.ans);
    }

    class Automaton {
        public int sign = 1;
        public long ans = 0;
        private String state = "start";
        private Map<String, String[]> table = new HashMap<String, String[]>() {{
            put("start", new String[]{"start", "signed", "in_number", "end"});
            put("signed", new String[]{"end", "end", "in_number", "end"});
            put("in_number", new String[]{"end", "end", "in_number", "end"});
            put("end", new String[]{"end", "end", "end", "end"});
        }};

        public void get(char c) {
            state = table.get(state)[get_col(c)];
            if ("in_number".equals(state)) {
                ans = ans * 10 + c - '0';
                ans = sign == 1 ? Math.min(ans, (long) Integer.MAX_VALUE) : Math.min(ans, -(long) Integer.MIN_VALUE);
            } else if ("signed".equals(state)) {
                sign = c == '+' ? 1 : -1;
            }
        }

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

    /*
    寻找最大面积的两根直线
     */
    public int maxArea1(int[] height) {
        if (height == null || height.length<=1){
            return 0;
        }
        int area = 0;
        for (int i = 0; i < height.length - 1; i ++) {
            for (int j = i + 1; j < height.length; j ++) {
                area = Math.max(area, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return area;
    }

    public int maxArea(int[] height){
        if (height == null || height.length<=1){
            return 0;
        }
        int left = 0, right = height.length - 1;
        int ans = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            ans = Math.max(ans, area);
            if (height[left] < height[right]) {
                left ++;
            }else {
                right --;
            }

        }
        return ans;
    }

    public String intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        int a = num/1000;
        int b = a > 0 ? (num - a * 10000)/100 : a/100;
        if (a > 0 && b > 0) {
            int c = (num - a * 10000 - b * 100)/10;
            int d = num - a * 10000 - b * 100 - c * 10;
            stringBuilder.append(countFlag(c, map.get(1000)));
            if (b == 9 || b == 4 || b == 5){
                stringBuilder.append(map.get(b * 100));
            }else if(b >= 0 && b <=3){
                stringBuilder.append(countFlag(b, "C"));
            }else if (b >5 && b <9) {
                stringBuilder.append("D").append(countFlag(num-5, "C"));
            }

        }else if (a <= 0 && b > 0) {
            int c = (num - b * 100) /10;
        }else if (a <= 0 && b <= 0) {
            int c = num / 100;

        }
        return stringBuilder.toString();
    }

    private String countFlag(int num, String s) {
        String result = "";
        if (num == 0){
            return result;
        }
        while(num > 0) {
            result = result + s;
            num --;
        }
        return result;
    }

    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intRoma(int num){
        StringBuilder roma = new StringBuilder();
        for (int i = 0; i < values.length; i ++ ) {
            int value = values[i];
            while (num >=value ) {
                roma.append(symbols[i]);
                num -= value;

            }
            if (num == 0){
                return roma.toString();
            }
        }
        return roma.toString();
    }

    public boolean isValid(String s) {
        if (s == null || s.length() <= 1) {
            return false;
        }
        int length = s.length();
        if (length%2 != 0)
            return false;
        else {
            char[] characters = s.toCharArray();
            //括号相邻
            for (int i = 0; i < length-1; i += 2){
                if (characterMap.get(characters[i]) == null)
                    return false;
                else if (characterMap.get(characters[i]) == characters[i+1]){
                    continue;
                }else {
                    int j = i;
                    if (characterMap.get(characters[j]) == null)
                        return false;
                    while (j < length - 1 && characterMap.get(characters[j]) != null
                            && characterMap.get(characters[j]) != characters[j+1]) {
                        j++;
                    }
                    int tempLength = (j - i + 1) * 2 + i ;
                    //长度不满足，返回false
                    if (tempLength > length){
                        return false;
                    }else {
                        char[] temp = s.substring(i, tempLength).toCharArray();
                        //不满足，返回false
                        if (!ddd(temp.length, temp))
                            return false;
                    }
                    //重新给i赋值
                    i = tempLength;
                }
            }

        }
        return true;
    }

    private boolean ddd(int length, char[] characters){
        Stack<Character> stack = new Stack<>();
        //括号相交叉
        for (int i = 0; i < length/2 ; i ++){
            stack.push(characters[i]);
        }
        int start = length/2;
        while (start < length) {
            Character character = stack.pop();
            if (character != null && characterMap.get(character) != null && characterMap.get(character) == characters[start]){
                start ++;
            }else {
                return false;
            }
        }
        return true;
    }
}
