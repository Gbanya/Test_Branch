package j2se;

public class Hero {
	String name; //����
    
    float hp; //Ѫ��
      
    float armor; //����
      
    int moveSpeed; //�ƶ��ٶ�

    public Hero(){System.out.println("Hero�޲ι��췽��");}
    public Hero(String name){System.out.println("Hero����һ�������Ĺ��췽��");}
    public void attack() {
        System.out.println(name + " ������һ�ι��� �����ǲ�ȷ������˭��");
    }
 
    public void attack(Hero h1) {
        System.out.println(name + "��" + h1.name + "������һ�ι��� ");
    }
 
    public void attack(Hero h1, Hero h2) {
        System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
    }

    public void showAddressInMemory() {
    	System.out.println("��ӡthis�����������ַ" + this);
    }
    
    public void setName1(String name) {//��������������һ��
    	name = name;
    }
    public void setName2(String heroname) {
    	name = heroname;
    }
    public void setName3(String name) {
    	this.name = name;
    }
    
    //�����������Ĺ��췽��,���캯��û�з�������
//    public Hero(String name,float hp) {
//    	this.name = name;
//    	System.out.println("���������Ĺ��췽��");
//    	this.hp = hp;
//    }
    public static void main(String[] args) {
        Hero bh = new Hero();
        bh.name = "�ͽ�����";
 
        Hero h1 = new Hero();
        h1.name = "����";
        Hero h2 = new Hero();
        h2.name = "��Ī";
 
        bh.attack(h1);
        bh.attack(h1, h2);
        ////////////////////////////
        /* this*/
        h1.showAddressInMemory();
        System.out.println("��ӡ���󿴵��������ַ��" + h1);
        
        //////////////////////////
        Hero h3 = new Hero();
        h3.setName1("teemo");
        System.out.println(h3.name);//�����null
        h3.setName2("garen");
        System.out.println(h3.name);//���garen
        h3.setName3("����");
        System.out.println(h3.name);
        
//        Hero h4 = new Hero("��Ī",383);
//        System.out.println("����h4��name��" + h4.name);
    }
}




















