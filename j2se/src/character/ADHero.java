package character;

public class ADHero  extends Hero implements AD,Mortal{
	public void physicAttack() {
		System.out.println("����������");
	}
	public void die() {
		System.out.println("ADӢ�۱�ɱ���ˣ�");
	}
	public static void battleWin() {//�������ظ�����෽������̬������
		System.out.println("ad hero battle win");
	}
	public ADHero() {
		System.out.println("AD Hero�Ĺ��췽��");
	}
	public ADHero(String name){
		super(name);
		System.out.println("AD  Hero�������Ĺ��췽��");
	}
	public static void main(String[] args) {
		//Hero.battleWin();
		//ADHero.battleWin();
		new ADHero("������");
		//h.battleWin();//������õĸ�����෽��
		//h.die();//�����������Ķ��󷽷�
	}
}
