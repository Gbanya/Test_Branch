package j2se;

public class Item {
	String name;
    int price;
     
    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }
     
    public static void main(String[] args) {
        Item i = new Item();
        i.effect();
         
        LifePotion lp =new LifePotion();
        lp.effect();
    }
}
