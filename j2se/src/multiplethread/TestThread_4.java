/*
* �ò��ִ�����Ҫ������֤�ػ��̵߳�Ч��
* */

package multiplethread;
import character.Hero;
public class TestThread_4 {
    public static void main(String[] args){
        Thread t1 = new Thread(){
            public void run(){
                int second = 1;
                while(true){
                    second++;
                }
            }
        };
        t1.setDaemon(true);//��t1����Ϊ�ػ��߳�
        t1.start();
        System.out.println("���ڵ�ǰ�����е��̶߳����ػ��̣߳��ʽ�����ǰ���̣�");
    }
}
