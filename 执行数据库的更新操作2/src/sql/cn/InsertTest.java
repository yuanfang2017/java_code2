package sql.cn;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/*
 * 数据库连接后，如果要对数据库进行操作，则肯定使用statement 接口完成，
 * 此接口可以使用connection 接口中提供的creatstatement方法实例化
 * 
 */
/*
 *   数据库的插入操作
 */
public class InsertTest {
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
    	   //定义一条sql 语句
    	  String sql = "insert into mytest(id,name,password,age)"+"values('07','leo','1234','nan')";
    	  //执行插入语句
    	  try {
			st.executeLargeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  //关闭数据库
    	  con.close();
    	  st.close();
    	  
	}
    /*
     * 太多的try catch  ，可以考虑直接在函数上抛
     */
}
