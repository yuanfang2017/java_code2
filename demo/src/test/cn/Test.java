package test.cn;
public class Test {
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	public static void main(String[] args) {
		  try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}

