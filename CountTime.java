//有效时间的数目
//分类讨论
class Solution72 {
    public int countTime(String time) {
        int hour = 0;
        if(time.charAt(0) == '?') {
            if(time.charAt(1) != '?') {
                int tmp = time.charAt(1) - '0';
                if(tmp <= 3) {
                    hour += 3;
                }else {
                    hour += 2;
                }
            }else {
                hour += 24;
            }
        }else {
            int tmp = time.charAt(0) - '0';
            if(time.charAt(1) == '?') {
                if(tmp < 2) {
                    hour += 10;
                }else {
                    hour += 4;
                }
            }
        }
        int minute = 0;
        if(time.charAt(3) == '?') {
            if(time.charAt(4) == '?') {
                minute += 60;
            }else {
                minute += 6;
            }
        }else {
            if(time.charAt(4) == '?') {
                minute += 10;
            }
        }

        if(minute == 0 && hour == 0) {
            return 1;
        }
        if(minute == 0) {
            return hour;
        }
        if(hour == 0) {
            return minute;
        }
        return minute * hour;
    }
}
public class CountTime {
    public static void main(String[] args) {

    }
}
