package character;

public class ADAPHero extends Hero implements AD,AP,Mortal{
	public void magicAttack() {
		System.out.println("ʹ��ħ������");
	}
	
	public void physicAttack() {
		System.out.println("ʹ��������");
	}
	public void die() {
		System.out.println("ADAPӢ�۱�ɱ���ˣ�");
	}
}
