package jdbc;

import java.sql.*;
public class Query_Hero1_100 {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","Yyq55555");
            Statement s = c.createStatement();){
            String sql = "select * from Hero1_100";
            //执行查询语句，并把结果返回给ResultSet
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int hp = rs.getInt(3);
                int damage = rs.getInt(4);
                System.out.println(id+' '+name+' '+hp+' '+damage);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
