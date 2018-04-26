package list.cn;

import java.util.LinkedList;
import java.util.List;

/*
 *  链表操作类 ：LinkedList<E>  是list接口的子类
 *  主要的方法：
 *  void addFirst(E e) 
          将指定元素插入此列表的开头。 
    void addLast(E e) 
          将指定元素添加到此列表的结尾。 
   boolean add(E e) 
          将指定元素添加到此列表的结尾。 
  void add(int index, E element) 
          在此列表中指定的位置插入指定的元素。 
  boolean addAll(Collection<? extends E> c) 
          添加指定 collection 中的所有元素到此列表的结尾，顺序是指定 collection 的迭代器返回这些元素的顺序。 
    remove() 
          获取并移除此列表的头（第一个元素）。 
    E remove(int index) 
          移除此列表中指定位置处的元素。 
   boolean remove(Object o) 
          从此列表中移除首次出现的指定元素（如果存在）。 
    E removeFirst() 
          移除并返回此列表的第一个元素。 
 

 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
	    list.addFirst("haha");
	    list.addLast("heihei");
	    System.out.println(list);
	    /*
	     * element() 
                               获取但不移除此列表的头（第一个元素）。
           E peek() 
                               获取但不移除此列表的头（第一个元素）。
           poll() 
                           获取并移除此列表的头（第一个元素） 
	     */
	   System.out.println("第一个元素是"+list.element()); 
	   System.out.println("获取但不删除第一个元素"+list.peek()); 
	   System.out.println("获取并移除列表的第一个元素"+list.poll()); 
	   System.out.println("删除之后的列表为"+list); 
	}

}
