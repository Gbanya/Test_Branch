package j2se;

public class Item {
	String name;
    int price;
     
    public void effect(){
        System.out.println("��Ʒʹ�ú󣬿�����Ч��");
    }
     
    public static void main(String[] args) {
        Item i = new Item();
        i.effect();
         
        LifePotion lp =new LifePotion();
        lp.effect();
    }
}
