package test.cn;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/*
 * �������ݿ�
 */
public class Test2 {
	//����mysql���ݿ����������
    public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
    //����mysql���ݿ�����ӵ�ַ
    public static final String DBURL = "jdbc:mysql://localhost:3306/test";
    //���ݿ�������û���
    public static final String DBUSER = "root";
    //���ݿ����������
    public static final String DBPASS = "1234";
    
	public static void main(String[] args) {
		//���ݿ����� ����
		Connection  con = null;
		
		//������������
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�������ݿ�ʱ��Ҫд�����ӵ��û���������
		 try {
			con = (Connection)DriverManager.getConnection(DBURL,DBUSER,DBPASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(con);
		 //�ر����ݿ�
		  try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		
		
	
	}
}
