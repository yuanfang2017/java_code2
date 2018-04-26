package fanshe.cn;
/*
 * 要想class类本身实例化其他类的对象，则可以使用 newInstance（）方法
 * 但是必须要保证实例化的类中存在一个无参构造方法
 */
public class Demo2 {
	public static void main(String[] args) {
		//创建 一个class对象
		Class<?> c = null;
		try {
			c = Class.forName("fanshe.cn.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // 	创建一个person 对象
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
