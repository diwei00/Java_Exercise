import java.util.*;
//旧键盘，利用set去重
public class OldKeyboard {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        while(scaner.hasNextLine()) {
            //按的键
            String str1 = scaner.nextLine();
            //实际录入
            String str2 = scaner.nextLine();
            String s1 = str1.toUpperCase();
            String s2 = str2.toUpperCase();
            HashSet<Character> hashset = new HashSet<>();
            for(int i = 0; i < s2.length(); i++) {
                char tmp = s2.charAt(i);
                hashset.add(tmp);
            }
            HashSet<Character> set = new HashSet<>();
            for(int i = 0; i < s1.length(); i++) {
                char tmp = s1.charAt(i);
                if(!hashset.contains(tmp)){
                    if(!set.contains(tmp)) {
                        set.add(tmp);
                        System.out.println(tmp);
                    }
                }
            }


        }

    }
}
