package fanshe.cn;
/*
 * ʵ����class������ַ���
 * 1��static Class<?> forName(String className) 
          ��������и����ַ����������ӿ�������� Class ���� ����Ĳ����������İ�.�� ·��
          �����Ǿ�̬���������Կ���ֱ��ʹ����������
          
   2����.class
   3������.getclass();
 */
public class Demo {
	public static void main(String[] args) {
		//new һ��class ����
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		//��һ�ַ���ʵ����
		try {
			c1 = Class.forName("fanshe.cn.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ڶ��ַ���ʵ����
		c2 = Person.class;
		//�����ַ���
		c3 = new Person().getClass();
		//����������
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
	}

}
