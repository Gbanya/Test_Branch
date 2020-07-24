package jdbc;//jdbc.Main.java
import java.sql.*;

public class Main {
    /***
     ����ʹ�õ����ݿ�����Ϊuser,�˺������Ϊroot,
     ���ݿ⺬��userinfo,
     �ñ��������ֶΣ�id(INT),userinfo(VARCHAR),password(VARCHAR)
     ���߿ɸ������ݿ��ʵ��������������޸�
     ***/
    public static void main(String[] args) {
        ResultSet rs = null;
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //1,��������
            Class.forName("com.mysql.jdbc.Driver");
            //2.��������
            //�˴�����ʵ�ʵ����ݿ����ƺ��˺���������޸�
            //��ʽΪjdbc:mysql://127.0.0.1:3306/���ݿ�����?useSSL=true&characterEncoding=utf-8&user=�˺���&password=����
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useSSL=true&characterEncoding=utf-8&user=root&password=Yyq55555");
            System.out.println("�������ӳɹ�");
            //3.дsql
            //�������ݿ�ʵ�ʵı���дSQL���
            String sql="select * from userinfo";
            //4.�õ�statement����ִ��sql
            statement = connection.prepareStatement(sql);
            //5.�õ������
            rs = statement.executeQuery();
            //6.��������
            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //7.�ر�
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(statement!=null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("�رճɹ�");
        }
    }
}

