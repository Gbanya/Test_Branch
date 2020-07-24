package jdbc;

import java.sql.*;
public class TestJDBC {
    public static void main(String[] args) {
        //������������connection��statement����Ϊ��Ҫ��finally�йرգ������������Ҫ���и��ǵ�finally��
        Connection c=null;
        Statement s=null;


        try{
            //��ʼ��������com.mysql.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("���ݿ��������سɹ���");

            //���������ݿ��Connection����
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","Yyq55555");
            System.out.println("���ݿ����ӳɹ���");

            //Statement������ִ��SQL���ģ��������ӣ�ɾ��
            s = c.createStatement();
            //System.out.println("��ȡ Statement����" + s);

            //׼��SQL���,ע�⣺�ַ���Ҫ�õ�����'
            String sql = "insert into Heroinfo values(null,'��Ī',313,50)";
            s.execute(sql);
            System.out.println("ִ�в������ɹ���");
        }catch(ClassNotFoundException e){//���ǲ����������ʧ�ܵ��쳣
            e.printStackTrace();
        }catch(SQLException e){//���ǲ������ݿ����ӡ����ִ��ʧ�ܵ��쳣
            e.printStackTrace();
        }finally{
            //���ݿ��������������Դ����ز������������ɹر����ݿ�ĺ�ϰ�ߡ��ȹر�statement���ٹر�connection���رյ�˳��������ʱ�෴��
            //�ȹر�statement
            if(s != null){
                try{
                    s.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            //�ٹر�connection
            if(c != null){
                try{
                    c.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }

        }

    }
}
