package character;

public class Hero {
	public String name;
	public float hp;
	public int moveSpeed;
	public int damage;
	static String copyright;//ʵ�����ԣ������ԣ�,���ж�������һֵ��
	
	public static int itemCapacity;//����������
	static {
		itemCapacity = 6;//��̬��ʼ���飬��ʼ��
	}
	public static void battleWin() {
		System.out.println("hero battle win");
	}
	public void die() {
		System.out.println("hero die");
	}


	public Hero(){ System.out.println("Hero�Ĺ��췽��"); }
	public Hero(String name){System.out.println("Hero����һ�������Ĺ��췽��");}

	public void attackHero(Hero h){
		try{
			//Ϊ�˱�ʾ������Ҫʱ�䣬ÿ�ι�����ͣ1000����
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		h.hp -= damage;
		System.out.format("%s ���ڹ��� %s��%s ��Ѫ����� %.0f%n",name,h.name,h.name,h.hp);
		if(h.isdead()){
			System.out.println(h.name+"���ˣ�");
		}
	}

	public boolean isdead(){
		return 0>=hp?true:false;
	}


	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		Hero.copyright = "��Ȩ��Riot Games��˾����";
		garen.copyright = "��˵����";//�������ǿ��Ը��ĵģ��������������Կ���ʹ����.�����ԺͶ���.������
		Hero teemo = new Hero("������");
		System.out.println("teemo.copyright:   "+teemo.copyright);//���ж�������һֵ
		System.out.println("itemCapacity:   " + Hero.itemCapacity);
	}
}
