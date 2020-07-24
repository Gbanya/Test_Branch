package file;

import java.io.File;
import java.util.ArrayList;
/*
* 这份代码是为了遍历C盘windows目录下的所有文件，并找出这些文件里最大的和最小的（非0）的哪个文件名，打印出它们的文件名。
*
* */

public class Windows {
    public static void main(String[] args){
        File f = new File("C:/Windows");
        String[] str = f.list();
        int flag = 1;
        File max_file = new File(f,str[0]);;
        File min_file = new File(f,str[0]);;
        for(int i=1;i<str.length;i++) {
            File f1 = new File(f, str[i]);
            ;
            if (max_file.length() < f1.length()) {
                max_file = f1;
            }
            if (min_file.length() > f1.length()) {
                min_file = f1;
            }

        }
        System.out.println("最大的文件是："+max_file+"，其大小是"+max_file.length());
        System.out.println("最小的文件是："+min_file+"，其大小是"+min_file.length());
    }



}

