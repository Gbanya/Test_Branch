package character;

public class Hero_duotai extends Hero{
	public void kill(Mortal m) {
		System.out.println(this.name+"ɱ����"+m);
		m.die();
	}
	static public void main(String[] args) {
		Hero_duotai garen = new Hero_duotai();
		garen.name = "����";
		ADHero h1 = new ADHero();
		h1.name = "����";
		APHero h2 = new APHero();
		h2.name = "��Ī";
		ADAPHero h3 = new ADAPHero();
		h3.name = "����";
		garen.kill(h1);
		garen.kill(h2);
		garen.kill(h3);
		
	}
}
