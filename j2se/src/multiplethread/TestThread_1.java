

package multiplethread;

public class TestThread_1 {

    public static void main(String[] args) {

        Thread t1= new Thread(){
            public void run(){
                int seconds =0;
                while(true){
                    try {
                        Thread.sleep(1000);//��ʾ��ǰ�߳���ͣ1000���룬�����̲߳���Ӱ�졣
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.printf("�Ѿ�����LOL %d ��%n", seconds++);
                }
            }
        };
        t1.start();

    }

}
