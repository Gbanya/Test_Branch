package jdbc;

import java.sql.*;
public class TestJDBC {
    public static void main(String[] args) {
        //现在这里声明connection和statement，因为需要在finally中关闭，因此作用域需要进行覆盖到finally。
        Connection c=null;
        Statement s=null;


        try{
            //初始化驱动类com.mysql.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功！");

            //建立与数据库的Connection连接
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","Yyq55555");
            System.out.println("数据库连接成功！");

            //Statement是用于执行SQL语句的，比如增加，删除
            s = c.createStatement();
            //System.out.println("获取 Statement对象" + s);

            //准备SQL语句,注意：字符串要用单引号'
            String sql = "insert into Heroinfo values(null,'提莫',313,50)";
            s.execute(sql);
            System.out.println("执行插入语句成功！");
        }catch(ClassNotFoundException e){//这是捕获加载驱动失败的异常
            e.printStackTrace();
        }catch(SQLException e){//这是捕获数据库连接、语句执行失败的异常
            e.printStackTrace();
        }finally{
            //数据库的链接是有限资源，相关操作结束后，养成关闭数据库的好习惯。先关闭statement、再关闭connection，关闭的顺序与连接时相反。
            //先关闭statement
            if(s != null){
                try{
                    s.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            //再关闭connection
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
