package file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFile_2 {
    public static void main(String[] args) throws IOException{
        //File f = new File("E:/LOLFolder/skin/garen.ski");
        File f = new File("E:/LOLFolder/LOL.exe");
        //以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        String str[] = f.list();
        for(String s : str){
            System.out.println(s);
        }
        //System.out.println("a: "+f.list());

        //以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        File[] fs = f.listFiles();
        System.out.println(fs);

        //以字符串的形式返回文件所在的文件夹路径
        f.getParent();
        System.out.println(f.getParent());

        //删除文件
        //f.delete();


    }
}
