package list.cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Collection 提供了2种方法：
 *  Object[] toArray() 
          返回包含此 collection 中所有元素的数组。 
     <T> T[]  toArray(T[] a) 
          返回包含此 collection 中所有元素的数组；返回数组的运行时类型与指定数组的运行时类型相同。 

 */
public class ListDemo {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	Collection<String> a = new ArrayList<String>();
	list.add("heiio");
	list.add("kittly");
	list.add("hope");
	list.add("love");
	//将集合变成对象数组
	Object[] obj = list.toArray();
	for (int i = 0; i < obj.length; i++) {
		System.out.println(obj[i]);
	}
	//第二种方法，<T> T[]  toArray(T[] a) 
	String [] str = list.toArray(new String []{});
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
}
}
