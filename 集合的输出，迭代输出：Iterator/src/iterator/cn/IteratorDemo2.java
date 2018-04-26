package iterator.cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 删除一个元素
 *   void remove() 
          从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。 
 */
public class IteratorDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		//创建一个迭代器
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			if ("cc".equals(str)) {
				itr.remove();
			}
			//else{
				// System.out.println(str);
			//}
		 
			
		}
		System.out.println(list);
	}

}
