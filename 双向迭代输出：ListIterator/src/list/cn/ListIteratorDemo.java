package list.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * iterator 接口只能由前向后的输出，不能实现由后向前输出
 * 为了实现由后向前的输出方式，可以使用ListIterator  接口
 * public interface ListIterator<E>extends Iterator<E>
 * ListIterator 接口的特点：
 *  1、ListIterator 接口只能通过list接口实例化，只能输出list接口中的内容
 *  
 *  主要的方法：
 *  方法摘要 
 void add(E e) 
          将指定的元素插入列表（可选操作）。 
 boolean hasNext() 
          以正向遍历列表时，如果列表迭代器有多个元素，则返回 true（换句话说，如果 next 返回一个元素而不是抛出异常，则返回 true）。 
 boolean hasPrevious() 
          如果以逆向遍历列表，列表迭代器有多个元素，则返回 true。 
 E next() 
          返回列表中的下一个元素。 
 int nextIndex() 
          返回对 next 的后续调用所返回元素的索引。 
 E previous() 
          返回列表中的前一个元素。 
 int previousIndex() 
          返回对 previous 的后续调用所返回元素的索引。 
 void remove() 
          从列表中移除由 next 或 previous 返回的最后一个元素（可选操作）。 
 void set(E e) 
          用指定元素替换 next 或 previous 返回的最后一个元素（可选操作）。 

 * 
 */
public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("ee");
		//创建一个ListIterator迭代器
		ListIterator<String> lit = list.listIterator();
		//由前向后输出
		while (lit.hasNext()) {
			String str = (String) lit.next();
			System.out.println(str);
			
		}
		//由后向前输出
		while (lit.hasPrevious()) {
		   String str2 = (String) lit.previous();	
		   System.out.println(str2);
		}
	}

}
