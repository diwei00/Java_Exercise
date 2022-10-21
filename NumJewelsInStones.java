import java.util.*;
//宝石与石头
//利用HashSet
class Solution66 {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hashSet = new HashSet<>();
        for(int i = 0; i < jewels.length(); i++) {
            char tmp = jewels.charAt(i);
            hashSet.add(tmp);
        }
        int count = 0;
        for(int i = 0; i < stones.length(); i++) {
            char tmp = stones.charAt(i);
            if(hashSet.contains(tmp)) {
                count++;
            }
        }
        return count;

    }
}
public class NumJewelsInStones {
    public static void main(String[] args) {

    }
}
