/*
* 该部分代码主要用于验证守护线程的效果
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
        t1.setDaemon(true);//将t1设置为守护线程
        t1.start();
        System.out.println("由于当前进程中的线程都是守护线程，故结束当前进程！");
    }
}
