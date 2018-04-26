package list.cn;

import java.util.ArrayList;
import java.util.List;

/*
 *  List<E> subList(int fromIndex, int toIndex) 
          返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。 
   boolean isEmpty() 
          如果列表不包含元素，则返回 true。 
    boolean contains(Object o) 
          如果列表包含指定的元素，则返回 true。 
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("列表是否为空："+list.isEmpty());
		list.add("heiio");
		list.add("kittly");
		list.add("hope");
		list.add("love");
		System.out.println("集合中是否有Kitty的元素"+list.contains("kittly"));
		System.out.println("集合中是否有kimi的元素"+list.contains("kimi"));
		List<String> li = list.subList(1, 3);
		System.out.print("截取2,3之间的元素是：");
		for (int i = 0; i <li.size(); i++) {
			System.out.print(li.get(i)+"、");
		}
	}

}
