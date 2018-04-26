package sql.cn;
/*
 * 数据库连接后，如果要对数据库进行操作，则肯定使用statement 接口完成，此接口可以使用connection 接口中提供的creatstatement方法完成
 * 
 */
/*
 *   数据库的插入操作
 */
public class InsertTest {
	//定义mysql数据库的驱动程序
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    //定义mysql数据库的连接地址
    public static final String DBURL = "jdbc:mysql://localhost:3306/test";
    //数据库的连接用户名
    public static final String DBUSER = "root";
    //数据库的连接密码
    public static final String DBPASS = "1234";
    public static void main(String[] args) {
		
	}

}
