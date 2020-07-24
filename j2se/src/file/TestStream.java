package file;
/*
* ����stream������һϵ�е�����
* */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class TestStream {
    public static void main(String[] args){
        //�ļ�lol.txt�����ڣ������д�ٶ�
        //���Ȱ�����������������try�����棬���������try���棬���������޷��ִ�finally
        File f = new File("E:/LOLFolder/LOL.txt");
        FileOutputStream fos = null;

        try{

            //׼��������2���ֽ����飬��88,89��ʼ�������Ӧ���ַ��ֱ���X��Y
            byte data[] = {87,88};//��byte[] data = {87,88}��һ����

            //���������ļ��������
            fos = new FileOutputStream(f);
            //������д�뵽�����
            fos.write(data);
        }catch (IOException w){
            w.printStackTrace();
        }finally {
            //��finally��ر���
            if(null!=fos){
                try{
                    fos.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }



        /*
        * ��ȡ�ļ�
        * */

        FileInputStream fis = null;
        try{
            //�������ļ���������
            fis = new FileInputStream(f);
            //ͨ��������������Ϳ��԰����ݴ�Ӳ�̣���ȡ��JAVA�������������Ҳ���Ƕ�ȡ���ڴ���

            //�����ֽ����飬�䳤�Ⱦ����ļ��ĳ��ȡ�    ��������Ҹо�����Ϊ�˴���ļ��е����ݣ���Ϊ������������ֽ�������ʽ��ȡ�ģ���Ϊ��Ҫ�����ֽ�����
            byte[] all= new byte[(int)f.length()];

            //���ֽ�������ʽ��ȡ�ļ���������
            fis.read(all);
            for(byte a:all){
                System.out.println(a);
            }


        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if(null!=fis){
                //ÿ��ʹ����������Ӧ�ý��йر�
                try{
                    fis.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
