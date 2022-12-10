import java.util.Arrays;
//串的处理
//2011省赛

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Test19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        StringBuilder str2 = new StringBuilder();
        String str = scan.nextLine();
        String[] arr = str.split(" ");//如果有连续多个空格，会切割为空串，则下面循环也不会进入
        for(int i = 0; i < arr.length; i++) {
            String tmp = arr[i];
            for(int j = 0; j < tmp.length(); j++) {
                if(j == 0 && tmp.charAt(j) > '9') {
                    str2.append((char)(tmp.charAt(0) - 32));
                }else {
                    char ret = tmp.charAt(j);
                    if(ret >= '0' && ret <= '9') {
                        int index = j - 1;
                        if(index >= 0 && tmp.charAt(index) > '9') {
                            str2.append("_");
                            str2.append(ret);
                        }else {
                            str2.append(ret);
                        }
                    }else {
                        int index = j - 1;
                        if(index >= 0 && tmp.charAt(index) >= '0' && tmp.charAt(index) <= '9') {
                            str2.append("_");
                            str2.append(ret);
                        }else {
                            str2.append(ret);
                        }
                    }
                }
            }
            str2.append(" ");
        }
        System.out.println(str2.toString());
        scan.close();
    }
}

