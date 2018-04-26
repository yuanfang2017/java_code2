package list.cn;

import java.util.ArrayList;
import java.util.List;

/*
 * list 删除元素
 * Collection 的方法：
 *1、 boolean remove(Object o) 
          从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。 
  2、boolean removeAll(Collection<?> c) 
          移除此 collection 中那些也包含在指定 collection 中的所有元素（可选操作）。 
          
 list扩充的方法：
   E remove(int index) 
      移除列表中指定位置的元素（可选操作）。
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//添加元素
		list.add("heiio");
		list.add("kittly");
		list.add("hope");
		list.add("love");
		//删除元素
		list.remove(0);
		list.remove(2);
		//list.remove(9);
		list.remove("hahha");
		list.remove("love");
		//输出对象
		System.out.println(list);
	}

}
