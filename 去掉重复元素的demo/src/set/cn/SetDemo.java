package set.cn;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * HashCode :一个对象的编码
 * 
 * 去掉重读元素的方法：覆写object中的HashCode方法，equals 方法，toString 方法
 * 
 */
public class SetDemo {
	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("张三",20));
		set.add(new Person("李四",20));
		set.add(new Person("张三",20));
		set.add(new Person("王五",40));
		set.add(new Person("张柳",34));
		System.out.println(set);
	}

}
