package file;

import java.io.File;
import java.util.ArrayList;
/*
* ��ݴ�����Ϊ�˱���C��windowsĿ¼�µ������ļ������ҳ���Щ�ļ������ĺ���С�ģ���0�����ĸ��ļ�������ӡ�����ǵ��ļ�����
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
        System.out.println("�����ļ��ǣ�"+max_file+"�����С��"+max_file.length());
        System.out.println("��С���ļ��ǣ�"+min_file+"�����С��"+min_file.length());
    }



}

