package character;

public class APHero extends Hero implements AP,Mortal{
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}
	public void die() {
		System.out.println("AP英雄被杀死了！");
	}
}
