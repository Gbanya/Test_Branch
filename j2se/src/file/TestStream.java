package file;
/*
* 流（stream）就是一系列的数据
* */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestStream {
    public static void main(String[] args){
        //文件lol.txt不存在，因此先写再读
        //首先把流的引用声明放在try的外面，如果声明在try里面，其作用域无法抵达finally
        File f = new File("E:/LOLFolder/LOL.txt");
        FileOutputStream fos = null;

        try{

            //准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X，Y
            byte data[] = {87,88};//与byte[] data = {87,88}是一样的

            //创建基于文件的输出流
            fos = new FileOutputStream(f);
            //把数据写入到输出流
            fos.write(data);
        }catch (IOException w){
            w.printStackTrace();
        }finally {
            //在finally里关闭流
            if(null!=fos){
                try{
                    fos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }



        /*
        * 读取文件
        * */

        FileInputStream fis = null;
        try{
            //创基于文件的输入流
            fis = new FileInputStream(f);
            //通过这个输入流，就可以把数据从硬盘，读取到JAVA的虚拟机中来，也就是读取到内存中

            //创建字节数组，其长度就是文件的长度。    这个数组我感觉就是为了存放文件中的内容，因为这个内容是以字节流的形式读取的，因为需要创建字节数组
            byte[] all= new byte[(int)f.length()];

            //以字节流的形式读取文件所有内容
            fis.read(all);
            for(byte a:all){
                System.out.println(a);
            }


        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if(null!=fis){
                //每次使用完流，都应该进行关闭
                try{
                    fis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
