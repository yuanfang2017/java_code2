package list.cn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Collection �ṩ��2�ַ�����
 *  Object[] toArray() 
          ���ذ����� collection ������Ԫ�ص����顣 
     <T> T[]  toArray(T[] a) 
          ���ذ����� collection ������Ԫ�ص����飻�������������ʱ������ָ�����������ʱ������ͬ�� 

 */
public class ListDemo {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	Collection<String> a = new ArrayList<String>();
	list.add("heiio");
	list.add("kittly");
	list.add("hope");
	list.add("love");
	//�����ϱ�ɶ�������
	Object[] obj = list.toArray();
	for (int i = 0; i < obj.length; i++) {
		System.out.println(obj[i]);
	}
	//�ڶ��ַ�����<T> T[]  toArray(T[] a) 
	String [] str = list.toArray(new String []{});
	for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	}
}
}
