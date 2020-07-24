package character;

public class GiantDragon {
	//私有化构造函数使得该类无法在外部通过new进行实例化，这样通过getInstance得到的应用始终指向同一个对象
	private GiantDragon() {
		
	}
	private static GiantDragon instance = new GiantDragon();;
	public static GiantDragon getInstance() {

		return instance;
	}
}
