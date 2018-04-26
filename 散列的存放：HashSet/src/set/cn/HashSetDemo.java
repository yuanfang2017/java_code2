package set.cn;

import java.util.HashSet;
import java.util.Set;

/*
 * 先讲一下set 接口
 * set接口是collection接口的子接口，与list接口不同的是，set接口不能加入重复的元素
 * set接口与list接口的定义上没有太大区别，但是set接口的主要方法与collection 是一致的
 * 也就是说set接口并没有对collection 接口进行扩充，只是比collection 接口更加严格了，不能增加重复元素
 */
public class HashSetDemo {
public static void main(String[] args) {
	/*
	 * hashset 是set 接口的一个子类，里面不能放重复的元素，而且采用散列的存储方式，所以没有顺序
	 */
	Set<String> set = new HashSet<String>();
	//添加元素
	set.add("aa");
	set.add("bb");
	set.add("bb");
	set.add("dd");
	set.add("ee");
	set.add("gg");
	set.add("hh");
	System.out.println(set);
}
}
