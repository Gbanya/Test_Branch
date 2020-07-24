package character;

public class Hero {
	public String name;
	public float hp;
	public int moveSpeed;
	public int damage;
	static String copyright;//实例属性（类属性）,所有对象共享这一值。
	
	public static int itemCapacity;//声明类属性
	static {
		itemCapacity = 6;//静态初始化块，初始化
	}
	public static void battleWin() {
		System.out.println("hero battle win");
	}
	public void die() {
		System.out.println("hero die");
	}


	public Hero(){ System.out.println("Hero的构造方法"); }
	public Hero(String name){System.out.println("Hero的有一个参数的构造方法");}

	public void attackHero(Hero h){
		try{
			//为了表示攻击需要时间，每次攻击暂停1000毫秒
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		h.hp -= damage;
		System.out.format("%s 正在攻击 %s，%s 的血变成了 %.0f%n",name,h.name,h.name,h.hp);
		if(h.isdead()){
			System.out.println(h.name+"死了！");
		}
	}

	public boolean isdead(){
		return 0>=hp?true:false;
	}


	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		Hero.copyright = "版权由Riot Games公司所有";
		garen.copyright = "我说了算";//类属性是可以更改的，并且设置类属性可以使用类.类属性和对象.类属性
		Hero teemo = new Hero("德莱文");
		System.out.println("teemo.copyright:   "+teemo.copyright);//所有对象共享这一值
		System.out.println("itemCapacity:   " + Hero.itemCapacity);
	}
}
