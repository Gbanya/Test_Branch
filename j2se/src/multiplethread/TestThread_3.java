/*
*
* �ⲿ�ִ�����Ҫչʾ���߳����ȼ���Ч��
* */

package multiplethread;
import character.Hero;
public class TestThread_3 {
    public static void main(String[] args){
        final Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 6160;
        gareen.damage = 1;

        final Hero teemo = new Hero();
        teemo.name = "��Ī";
        teemo.hp = 3000;
        teemo.damage = 1;

        final Hero bh = new Hero();
        bh.name = "�ͽ�����";
        bh.hp = 5000;
        bh.damage = 1;

        final Hero leesin = new Hero();
        leesin.name = "äɮ";
        leesin.hp = 4505;
        leesin.damage = 1;

        Thread t1= new Thread(){
            public void run(){

                while(!teemo.isdead()){
                    gareen.attackHero(teemo);
                }
            }
        };

        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isdead()){
                    //��ʱ��ͣ��ʹ��t1����ռ����Դ
                    Thread.yield();

                    bh.attackHero(leesin);
                }
            }
        };

        t1.setPriority(Thread.MAX_PRIORITY);//t1�̵߳����ȼ�����
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
