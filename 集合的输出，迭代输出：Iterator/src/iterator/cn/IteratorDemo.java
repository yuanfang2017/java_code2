package iterator.cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ע�⣺ֻҪ�����˼�������Ĳ�������һ��ʹ��iterator�ӿ�
 *  
 *  iterator���ӿ�      public interface Iterator<E>
 *  ��Ҫ�ķ�����
 *   boolean hasNext() 
          �������Ԫ�ؿ��Ե������򷵻� true�� 
     E next() 
          ���ص�������һ��Ԫ�ء� 
     void remove() 
          �ӵ�����ָ��� collection ���Ƴ����������ص����һ��Ԫ�أ���ѡ�������� 

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
		//�������
		//����һ��������
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}
	}
}
