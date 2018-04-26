package sql.cn;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/*
 * 主要讲ResultSet 接口
 * ResultSet 接口的作用是 保存 数据库查询的结果，实际上是保存在内存中了
 */
public class ResultSetTest {
	//定义mysql数据库的驱动程序
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    //定义mysql数据库的连接地址
    public static final String DBURL = "jdbc:mysql://localhost:3306/fannie";
    //数据库的连接用户名
    public static final String DBUSER = "root";
    //数据库的连接密码
    public static final String DBPASS = "1234";
    public static void main(String[] args) throws SQLException {
    	 //数据库的驱动
    	try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //连接数据库
    	Connection con = null;
    	  try {
			con = (Connection)DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  //数据库操作接口
    	  Statement st = null;
    	  //实例化 st
    	   try {
			st = (Statement)con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   //定义一条查询语句
    	    String sql = "select id,name,password,age from mytest";
    	   //定义一个保存结果的对象
    	   ResultSet rt = null;
    	   //实例化rt
    	   rt = st.executeQuery(sql);
    	   //取得内容
    	   while (rt.next()) {
			int id = rt.getInt(1);
		    String name =rt.getString(2);
		    String password = rt.getString(3);
		    String age  = rt.getString(3);
			System.out.print("id--"+id);
			System.out.print(",name--"+name);
			System.out.print(",password--"+password);
			System.out.println(",age--"+age);	
		}
    	  //关闭数据库
    	  con.close();
    	  st.close();
    }

}
