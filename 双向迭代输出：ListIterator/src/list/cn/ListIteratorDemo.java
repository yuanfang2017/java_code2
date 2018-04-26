package list.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * iterator �ӿ�ֻ����ǰ�������������ʵ���ɺ���ǰ���
 * Ϊ��ʵ���ɺ���ǰ�������ʽ������ʹ��ListIterator  �ӿ�
 * public interface ListIterator<E>extends Iterator<E>
 * ListIterator �ӿڵ��ص㣺
 *  1��ListIterator �ӿ�ֻ��ͨ��list�ӿ�ʵ������ֻ�����list�ӿ��е�����
 *  
 *  ��Ҫ�ķ�����
 *  ����ժҪ 
 void add(E e) 
          ��ָ����Ԫ�ز����б���ѡ�������� 
 boolean hasNext() 
          ����������б�ʱ������б�������ж��Ԫ�أ��򷵻� true�����仰˵����� next ����һ��Ԫ�ض������׳��쳣���򷵻� true���� 
 boolean hasPrevious() 
          �������������б��б�������ж��Ԫ�أ��򷵻� true�� 
 E next() 
          �����б��е���һ��Ԫ�ء� 
 int nextIndex() 
          ���ض� next �ĺ�������������Ԫ�ص������� 
 E previous() 
          �����б��е�ǰһ��Ԫ�ء� 
 int previousIndex() 
          ���ض� previous �ĺ�������������Ԫ�ص������� 
 void remove() 
          ���б����Ƴ��� next �� previous ���ص����һ��Ԫ�أ���ѡ�������� 
 void set(E e) 
          ��ָ��Ԫ���滻 next �� previous ���ص����һ��Ԫ�أ���ѡ�������� 

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
		//����һ��ListIterator������
		ListIterator<String> lit = list.listIterator();
		//��ǰ������
		while (lit.hasNext()) {
			String str = (String) lit.next();
			System.out.println(str);
			
		}
		//�ɺ���ǰ���
		while (lit.hasPrevious()) {
		   String str2 = (String) lit.previous();	
		   System.out.println(str2);
		}
	}

}
