package j2se;

//public class Creat_Hero {
//	String name;
//	float hp;
//	float armor;
//	int moveSpeed;
//	public Creat_Hero(String name,float hp) {
//		this.name = name;
//		this.hp = hp;
//	}
//	public void attack(Creat_Hero hero,int damage) {
//		hero.hp = hero.hp - damage;
//	}
//	public static void main(String[] args) {
//		Creat_Hero garen = new Creat_Hero("����",616);
//		Creat_Hero teemo = new Creat_Hero("��Ī",383);
//		garen.attack(teemo, 100);
//		System.out.println(teemo.hp);
//	}
//}



public class Creat_Hero {
    
    String name; //����
       
    float hp; //Ѫ��
       
    float armor; //����
       
    int moveSpeed; //�ƶ��ٶ�
    
    public Creat_Hero(){
    	
    }
    
    public Creat_Hero(String name,float hp){
    	this.name = name;
        this.hp = hp;
    }

    //����
    public void revive(Creat_Hero h){
    	//h = new Creat_Hero("��Ī",383);
    	h.hp = 383;
    }

    public static void main(String[] args) {
        Creat_Hero teemo =  new Creat_Hero("��Ī",383);
        
        //�ܵ�400�˺�������
        teemo.hp = teemo.hp - 400;
        
        teemo.revive(teemo);
        
        //���⣺ System.out.println(teemo.hp); ������٣� ��ô��⣿
        System.out.println(teemo.hp);
        
    }
     
}

