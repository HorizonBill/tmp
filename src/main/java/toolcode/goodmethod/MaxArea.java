package toolcode.goodmethod;

public class MaxArea {

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
}
