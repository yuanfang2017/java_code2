package test.cn;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/*
 * 连接数据库
 */
public class Test2 {
	//定义mysql数据库的驱动程序
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    //定义mysql数据库的连接地址
    public static final String DBURL = "jdbc:mysql://localhost:3306/test";
    //数据库的连接用户名
    public static final String DBUSER = "root";
    //数据库的连接密码
    public static final String DBPASS = "1234";
    
	public static void main(String[] args) {
		//数据库连接 对象
		Connection  con = null;
		
		//记载驱动程序
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//连接数据库时，要写上连接的用户名和密码
		 try {
			con = (Connection)DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(con);
		 //关闭数据库
		  try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		
		
	
	}
}
