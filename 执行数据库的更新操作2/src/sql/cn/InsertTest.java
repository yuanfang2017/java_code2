package sql.cn;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/*
 * ���ݿ����Ӻ����Ҫ�����ݿ���в�������϶�ʹ��statement �ӿ���ɣ�
 * �˽ӿڿ���ʹ��connection �ӿ����ṩ��creatstatement����ʵ����
 * 
 */
/*
 *   ���ݿ�Ĳ������
 */
public class InsertTest {
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
    	   //����һ��sql ���
    	  String sql = "insert into mytest(id,name,password,age)"+"values('07','leo','1234','nan')";
    	  //ִ�в������
    	  try {
			st.executeLargeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  //�ر����ݿ�
    	  con.close();
    	  st.close();
    	  
	}
    /*
     * ̫���try catch  �����Կ���ֱ���ں�������
     */
}
