package file;

import java.io.File;

//util�������������Random��ɨ������Scanner��������Date��������Calendar����ʱ������Timer Task��������Arrays
import java.io.IOException;
import java.util.Date;
public class TestFile_1 {
    public static void main(String[] args){
        File f = new File("e:/LOLFolder/LOL.exe");
        System.out.println("��ǰ�ļ��ǣ� "+f);

        //�ļ��Ƿ����
        System.out.println("�ж��ļ��Ƿ���ڣ� " + f.exists());


        f.getParentFile().mkdirs();
        try {
            f.createNewFile();//�����ļ�LOL.exe�������ļ���
        } catch (IOException e) {
            e.printStackTrace();//������Ҫ��e.printStackTrace()����ӡ�쳣�������������
            //log.error("",e);
        }
        System.out.println("f.getParentFile():"+f.getParentFile());
        //�Ƿ����ļ���
        System.out.println("�ж��Ƿ����ļ��У�"+f.isDirectory());

        //�Ƿ����ļ�
        System.out.println("�ж��Ƿ����ļ���" + f.isFile());

        //�ļ�����
        System.out.println("��ȡ�ļ��ĳ��ȣ� "+f.length());

        //�ļ�����޸ĵ�ʱ��
        long time = f.lastModified();//���ص�����1970��1��1��0:00�����ĺ�����
        Date d = new Date(time);//���õ��ĺ�����ת��Ϊ������ꡢ�¡��ա�ʱ���֡���
        System.out.println("��ȡ�ļ������Ŷ�޸�ʱ��"+d);

        //�ļ�������
        File f2 = new File("e:/LOLFolder/DOTA.exe");
        f.renameTo(f2);
        System.out.println("��LOL.exe��������DOTA.exe");
        System.out.println("ע�⣺ ��Ҫ��D:\\LOLFolderȷʵ����һ��LOL.exe,\r\n�ſ��Կ�����Ӧ���ļ����ȡ��޸�ʱ�����Ϣ");
    }
}
