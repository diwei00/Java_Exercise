//验证回文串
class Solution2 {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();

        char[] arr = new char[str.length()];
        int index = 0;
        for(int i = 0; i < str.length(); i++) {
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    || (str.charAt(i) >= '0' && str.charAt(i) <='9')){
                arr[index++] = str.charAt(i);
            }
        }
        int left = 0;
        int right = index - 1;
        while(left < right) {
            if(arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
public class IsPalindrome {
    public static void main(String[] args) {
        String str = "race a car";
        Solution2 solution2 = new Solution2();
        if(solution2.isPalindrome(str)) {
            System.out.println("aaa");
        }
    }
}
