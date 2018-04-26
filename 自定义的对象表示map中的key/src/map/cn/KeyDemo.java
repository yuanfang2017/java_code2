package map.cn;

import java.util.HashMap;
import java.util.Map;

/*
 * 自定义对象作为集合当中的
 */
public class KeyDemo {public static void main(String[] args) {
	Map<Person, String> map = new HashMap<Person, String>();
	//new 一个 person 对象
	Person per = new Person("张三",20);
	//向集合中添加元素
	  map.put(per, "李四");
	  System.out.println(map.get(per)); 	
}

}
