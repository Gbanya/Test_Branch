package file;

import java.io.File;

//util包里有随机数类Random、扫描器类Scanner、日期类Date、日历类Calendar、定时任务类Timer Task、数组类Arrays
import java.io.IOException;
import java.util.Date;
public class TestFile_1 {
    public static void main(String[] args){
        File f = new File("e:/LOLFolder/LOL.exe");
        System.out.println("当前文件是： "+f);

        //文件是否存在
        System.out.println("判断文件是否存在： " + f.exists());


        f.getParentFile().mkdirs();
        try {
            f.createNewFile();//创建文件LOL.exe而不是文件夹
        } catch (IOException e) {
            e.printStackTrace();//尽量不要用e.printStackTrace()来打印异常，容易造成锁死
            //log.error("",e);
        }
        System.out.println("f.getParentFile():"+f.getParentFile());
        //是否是文件夹
        System.out.println("判断是否是文件夹："+f.isDirectory());

        //是否是文件
        System.out.println("判断是否是文件：" + f.isFile());

        //文件长度
        System.out.println("获取文件的长度： "+f.length());

        //文件最后修改的时间
        long time = f.lastModified();//返回的是自1970年1月1日0:00以来的毫秒数
        Date d = new Date(time);//将得到的毫秒数转化为具体的年、月、日、时、分、秒
        System.out.println("获取文件的最后哦修改时间"+d);

        //文件重命名
        File f2 = new File("e:/LOLFolder/DOTA.exe");
        f.renameTo(f2);
        System.out.println("把LOL.exe改名成了DOTA.exe");
        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");
    }
}
