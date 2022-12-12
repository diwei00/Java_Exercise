//删除字符
import java.util.*;
public class Test21 {
    //暴力法
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        for(int i = 0; i < str2.length(); i++) {
            StringBuilder str3 = new StringBuilder();
            for(int j = 0; j < str1.length(); j++) {
                if(str1.charAt(j) != str2.charAt(i)) {
                    str3.append(str1.charAt(j));
                }
            }
            str1 = str3.toString();
        }
        System.out.println(str1);
    }
    //利用hashmap
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < str2.length(); i++) {
                char ret = str2.charAt(i);
                if(map.get(ret) == null) {
                    map.put(ret, 1);
                }
            }
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < str1.length(); i++) {
                if(map.get(str1.charAt(i)) == null) {
                    str.append(str1.charAt(i));
                }
            }
            System.out.print(str);

        }
    }


}

