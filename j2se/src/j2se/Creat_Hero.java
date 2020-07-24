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
//		Creat_Hero garen = new Creat_Hero("盖伦",616);
//		Creat_Hero teemo = new Creat_Hero("提莫",383);
//		garen.attack(teemo, 100);
//		System.out.println(teemo.hp);
//	}
//}



public class Creat_Hero {
    
    String name; //姓名
       
    float hp; //血量
       
    float armor; //护甲
       
    int moveSpeed; //移动速度
    
    public Creat_Hero(){
    	
    }
    
    public Creat_Hero(String name,float hp){
    	this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(Creat_Hero h){
    	//h = new Creat_Hero("提莫",383);
    	h.hp = 383;
    }

    public static void main(String[] args) {
        Creat_Hero teemo =  new Creat_Hero("提莫",383);
        
        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;
        
        teemo.revive(teemo);
        
        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？
        System.out.println(teemo.hp);
        
    }
     
}

