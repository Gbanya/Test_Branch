package character;

public class GiantDragon {
	//˽�л����캯��ʹ�ø����޷����ⲿͨ��new����ʵ����������ͨ��getInstance�õ���Ӧ��ʼ��ָ��ͬһ������
	private GiantDragon() {
		
	}
	private static GiantDragon instance = new GiantDragon();;
	public static GiantDragon getInstance() {

		return instance;
	}
}
