package fanshe.cn;
/*
 * Ҫ��class�౾��ʵ����������Ķ��������ʹ�� newInstance��������
 * ���Ǳ���Ҫ��֤ʵ���������д���һ���޲ι��췽��
 */
public class Demo2 {
	public static void main(String[] args) {
		//���� һ��class����
		Class<?> c = null;
		try {
			c = Class.forName("fanshe.cn.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // 	����һ��person ����
		Person p = null;
		try {
			p = (Person)c.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.setAge(10);
		p.setName("zhangsan");
		System.out.println(p.getAge()+p.getName());
		
	}

}
