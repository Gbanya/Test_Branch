/*
* �ⲿ�ִ�����Ҫ��Ϊ�˿����߳�1���뵽���̵߳�Ч���������ᵼ��ֻ���߳�1ִ��������̲߳��ܽ�������ִ�У�
*
*
* */


package multiplethread;

import character.Hero;
public class TestThread_2 {
    public static void main(String[] args){
        final Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 616;
        gareen.damage = 50;

        final Hero teemo = new Hero();
        teemo.name = "��Ī";
        teemo.hp = 300;
        teemo.damage = 30;

        final Hero bh = new Hero();
        bh.name = "�ͽ�����";
        bh.hp = 500;
        bh.damage = 65;

        final Hero leesin = new Hero();
        leesin.name = "äɮ";
        leesin.hp = 455;
        leesin.damage = 80;

        Thread t1 = new Thread(){
            public void run(){
                while(!teemo.isdead()){
                    gareen.attackHero(teemo);
                }
            }
        };
        t1.start();

        //����ִ�е����һֱ����main�߳�������
        try{
            //��t1�̼߳��뵽main�߳��У�ֻ��t1�߳����н������Ż����������
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        Thread t2 = new Thread(){
            public void run(){
                while(!leesin.isdead()){
                    bh.attackHero(leesin);
                }
            }
        };
        //ͨ��������Է��֣��ڸ��װ���Īɱ���󣬲Ż�����t2�߳�
        t2.start();
    }

}
