package character;

public class ADAPHero extends Hero implements AD,AP,Mortal{
	public void magicAttack() {
		System.out.println("使用魔法攻击");
	}
	
	public void physicAttack() {
		System.out.println("使用物理攻击");
	}
	public void die() {
		System.out.println("ADAP英雄被杀死了！");
	}
}
