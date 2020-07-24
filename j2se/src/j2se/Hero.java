package j2se;

public class Hero {
	String name; //姓名
    
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度

    public Hero(){System.out.println("Hero无参构造方法");}
    public Hero(String name){System.out.println("Hero的有一个参数的构造方法");}
    public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }
 
    public void attack(Hero h1) {
        System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
    }
 
    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
    }

    public void showAddressInMemory() {
    	System.out.println("打印this看到的虚拟地址" + this);
    }
    
    public void setName1(String name) {//参数名与属性名一样
    	name = name;
    }
    public void setName2(String heroname) {
    	name = heroname;
    }
    public void setName3(String name) {
    	this.name = name;
    }
    
    //带两个参数的构造方法,构造函数没有返回类型
//    public Hero(String name,float hp) {
//    	this.name = name;
//    	System.out.println("两个参数的构造方法");
//    	this.hp = hp;
//    }
    public static void main(String[] args) {
        Hero bh = new Hero();
        bh.name = "赏金猎人";
 
        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";
 
        bh.attack(h1);
        bh.attack(h1, h2);
        ////////////////////////////
        /* this*/
        h1.showAddressInMemory();
        System.out.println("打印对象看到的虚拟地址：" + h1);
        
        //////////////////////////
        Hero h3 = new Hero();
        h3.setName1("teemo");
        System.out.println(h3.name);//输出空null
        h3.setName2("garen");
        System.out.println(h3.name);//输出garen
        h3.setName3("死歌");
        System.out.println(h3.name);
        
//        Hero h4 = new Hero("提莫",383);
//        System.out.println("对象h4的name：" + h4.name);
    }
}




















