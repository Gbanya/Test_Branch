/*
* 这部分代码主要是为了看看线程1加入到主线程的效果（这样会导致只有线程1执行完后，主线程才能接着往下执行）
*
*
* */


package multiplethread;

import character.Hero;
public class TestThread_2 {
    public static void main(String[] args){
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        final Hero leesin = new Hero();
        leesin.name = "盲僧";
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

        //代码执行到这里，一直是在main线程中运行
        try{
            //将t1线程加入到main线程中，只有t1线程运行结束，才会继续往下走
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
        //通过结果可以发现，在盖伦把提莫杀掉后，才会运行t2线程
        t2.start();
    }

}
