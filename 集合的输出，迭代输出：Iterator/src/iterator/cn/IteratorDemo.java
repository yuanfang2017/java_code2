package iterator.cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 注意：只要碰到了集合输出的操作，就一定使用iterator接口
 *  
 *  iterator：接口      public interface Iterator<E>
 *  主要的方法：
 *   boolean hasNext() 
          如果仍有元素可以迭代，则返回 true。 
     E next() 
          返回迭代的下一个元素。 
     void remove() 
          从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。 

 * 
 */
public class IteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		//迭代输出
		//创建一个迭代器
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}
	}
}
