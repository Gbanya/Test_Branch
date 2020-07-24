package character;

public class Hero1 {
//	public String name = "some hero";
//	public Hero1() {
//		name = "one hero";
//	}
//	{
//		name = "the hero";
//	}
	public static void main(String[] args) {
		//Hero h = new Hero();
		ADHero ad =new ADHero();
		Support s = new Support();
		
		Hero h = ad;
		AD adi = (AD)h;
		//h.physicAttack();
		APHero ap = (APHero)adi;
		
		
//		ad.name = "…‰ ÷";
//		h = ad;
//		System.out.println(ad.name);
//		System.out.println(h.name);
//		System.out.println(h instanceof Hero);
//		
//		//h.physicAttack();
//		
//		AD adi = ad;
//		adi.physicAttack();
//		System.out.println(adi instanceof AD);
		//System.out.println(adi.name);
	}
}
