package file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFile_2 {
    public static void main(String[] args) throws IOException{
        //File f = new File("E:/LOLFolder/skin/garen.ski");
        File f = new File("E:/LOLFolder/LOL.exe");
        //���ַ����������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
        String str[] = f.list();
        for(String s : str){
            System.out.println(s);
        }
        //System.out.println("a: "+f.list());

        //���ļ��������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
        File[] fs = f.listFiles();
        System.out.println(fs);

        //���ַ�������ʽ�����ļ����ڵ��ļ���·��
        f.getParent();
        System.out.println(f.getParent());

        //ɾ���ļ�
        //f.delete();


    }
}
