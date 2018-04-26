package fanshe.cn;
/*
 * 实例化class类的三种方法
 * 1、static Class<?> forName(String className) 
          返回与带有给定字符串名的类或接口相关联的 Class 对象。 传入的参数是完整的包.类 路径
          由于是静态方法，所以可以直接使用类名调用
          
   2、类.class
   3、对象.getclass();
 */
public class Demo {
	public static void main(String[] args) {
		//new 一个class 对象
		Class<?> c1 = null;
		Class<?> c2 = null;
		Class<?> c3 = null;
		//第一种方法实例化
		try {
			c1 = Class.forName("fanshe.cn.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//第二种方法实例化
		c2 = Person.class;
		//第三种方法
		c3 = new Person().getClass();
		//输出类的名称
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		
	}

}
