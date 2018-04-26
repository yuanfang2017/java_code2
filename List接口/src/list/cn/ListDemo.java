package list.cn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * java.util 接口 List<E>
 * 定义：public interface List<E>extends Collection<E>
 * list 接口与Collection 不同的是： 在LIst的接口中大量的扩充了Collection接口，拥有比
 * Collection接口中更多的方法定义，其中有些方法还比较常用
 * 
 * boolean add(E e) 
          向列表的尾部添加指定的元素（可选操作）。 
 void add(int index, E element) 
          在列表的指定位置插入指定元素（可选操作）。 
 boolean addAll(Collection<? extends E> c) 
          添加指定 collection 中的所有元素到此列表的结尾，顺序是指定 collection 的迭代器返回这些元素的顺序（可选操作）。 
 boolean addAll(int index, Collection<? extends E> c) 
          将指定 collection 中的所有元素都插入到列表中的指定位置（可选操作）。 

 */
public class ListDemo {
    public static void main(String[] args) {
		//创建list 对象，由于list是接口，所以需要用子类进行实例化 ArrayList
    	List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        //创建 Collection对象，由于Collection是接口，所以需要用子类进行实例化 也是：ArrayList
        Collection<String> collection = new ArrayList<String>();
        collection.add("wang");
        collection.add("yuanfang");
        //可以传一个Collection 对象，就是将Collection中的所有元素添加进来
        list.addAll(collection);
        //输出对象
        System.out.println(list);
        System.out.println(collection);
        
	}
  
}
