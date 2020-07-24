package character;

public class TestGiantDragon {
	public static void main(String[] args) {
		GiantDragon g1 = GiantDragon.getInstance();
		GiantDragon g2 = GiantDragon.getInstance();
		//GiantDragon g3 = new GiantDragon();
		System.out.println(g1==g2);//g1和g2都是同一个对象
		//System.out.println(g1==g3);
	}
	
	
}
