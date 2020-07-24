package character;

public class ADHero  extends Hero implements AD,Mortal{
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	public void die() {
		System.out.println("AD英雄被杀死了！");
	}
	public static void battleWin() {//子类隐藏父类的类方法（静态方法）
		System.out.println("ad hero battle win");
	}
	public ADHero() {
		System.out.println("AD Hero的构造方法");
	}
	public ADHero(String name){
		super(name);
		System.out.println("AD  Hero带参数的构造方法");
	}
	public static void main(String[] args) {
		//Hero.battleWin();
		//ADHero.battleWin();
		new ADHero("德莱文");
		//h.battleWin();//这里调用的父类的类方法
		//h.die();//这里调用子类的对象方法
	}
}
