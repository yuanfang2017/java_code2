package meiju.cn;
/*
 * enum  ��  �ؼ���
 * ��ʽ��[ public] enum  ö����������{
 *   ö�ٶ���1��ö�ٶ���2��ö�ٶ��� 3  ....
 * }
 */
public class enumDemo {
	public static void main(String[] args) {
		Color c = Color.RED;
				System.out.println(c);
				
				//ö��.values() �õ�ȫ����ö�����ͣ����ص��Ƕ�������
				Color[] color = Color.values();
				for (int i = 0; i < color.length; i++) {
					System.out.println(color[i]);
				}
				//ʹ��foreach ���
				for (Color co:Color.values()) {
					System.out.println(co);
				}
				
		
	}
	

}
