package jdbc;

import java.sql.*;
public class HERO1_100 {
    public static void main(String[] args){
        try{
            //��ʼ������
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","Yyq55555");Statement s = c.createStatement();){
            System.out.println("���ݿ����ӳɹ�");
            for(int i=1;i<=100;i++){
                String sql = "insert into Hero1_100 values("+i+","+"'Ӣ��"+i+"',313,50)";
                s.execute(sql);

            }        }catch(SQLException e){
            e.printStackTrace();
        }

    }
}
