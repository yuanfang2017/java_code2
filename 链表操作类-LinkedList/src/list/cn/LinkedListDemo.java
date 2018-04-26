package list.cn;

import java.util.LinkedList;
import java.util.List;

/*
 *  ��������� ��LinkedList<E>  ��list�ӿڵ�����
 *  ��Ҫ�ķ�����
 *  void addFirst(E e) 
          ��ָ��Ԫ�ز�����б�Ŀ�ͷ�� 
    void addLast(E e) 
          ��ָ��Ԫ����ӵ����б�Ľ�β�� 
   boolean add(E e) 
          ��ָ��Ԫ����ӵ����б�Ľ�β�� 
  void add(int index, E element) 
          �ڴ��б���ָ����λ�ò���ָ����Ԫ�ء� 
  boolean addAll(Collection<? extends E> c) 
          ���ָ�� collection �е�����Ԫ�ص����б�Ľ�β��˳����ָ�� collection �ĵ�����������ЩԪ�ص�˳�� 
    remove() 
          ��ȡ���Ƴ����б��ͷ����һ��Ԫ�أ��� 
    E remove(int index) 
          �Ƴ����б���ָ��λ�ô���Ԫ�ء� 
   boolean remove(Object o) 
          �Ӵ��б����Ƴ��״γ��ֵ�ָ��Ԫ�أ�������ڣ��� 
    E removeFirst() 
          �Ƴ������ش��б�ĵ�һ��Ԫ�ء� 
 

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
                               ��ȡ�����Ƴ����б��ͷ����һ��Ԫ�أ���
           E peek() 
                               ��ȡ�����Ƴ����б��ͷ����һ��Ԫ�أ���
           poll() 
                           ��ȡ���Ƴ����б��ͷ����һ��Ԫ�أ� 
	     */
	   System.out.println("��һ��Ԫ����"+list.element()); 
	   System.out.println("��ȡ����ɾ����һ��Ԫ��"+list.peek()); 
	   System.out.println("��ȡ���Ƴ��б�ĵ�һ��Ԫ��"+list.poll()); 
	   System.out.println("ɾ��֮����б�Ϊ"+list); 
	}

}
