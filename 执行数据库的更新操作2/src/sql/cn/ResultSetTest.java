package sql.cn;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/*
 * ��Ҫ��ResultSet �ӿ�
 * ResultSet �ӿڵ������� ���� ���ݿ��ѯ�Ľ����ʵ�����Ǳ������ڴ�����
 */
public class ResultSetTest {
	//����mysql���ݿ����������
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    //����mysql���ݿ�����ӵ�ַ
    public static final String DBURL = "jdbc:mysql://localhost:3306/fannie";
    //���ݿ�������û���
    public static final String DBUSER = "root";
    //���ݿ����������
    public static final String DBPASS = "1234";
    public static void main(String[] args) throws SQLException {
    	 //���ݿ������
    	try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //�������ݿ�
    	Connection con = null;
    	  try {
			con = (Connection)DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  //���ݿ�����ӿ�
    	  Statement st = null;
    	  //ʵ���� st
    	   try {
			st = (Statement)con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   //����һ����ѯ���
    	    String sql = "select id,name,password,age from mytest";
    	   //����һ���������Ķ���
    	   ResultSet rt = null;
    	   //ʵ����rt
    	   rt = st.executeQuery(sql);
    	   //ȡ������
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
    	  //�ر����ݿ�
    	  con.close();
    	  st.close();
    }

}
