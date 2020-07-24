

package multiplethread;

public class TestThread_1 {

    public static void main(String[] args) {

        Thread t1= new Thread(){
            public void run(){
                int seconds =0;
                while(true){
                    try {
                        Thread.sleep(1000);//表示当前线程暂停1000毫秒，其他线程不受影响。
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);
                }
            }
        };
        t1.start();

    }

}
