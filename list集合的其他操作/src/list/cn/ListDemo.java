package list.cn;

import java.util.ArrayList;
import java.util.List;

/*
 *  List<E> subList(int fromIndex, int toIndex) 
          �����б���ָ���� fromIndex������ ���� toIndex����������֮��Ĳ�����ͼ�� 
   boolean isEmpty() 
          ����б�����Ԫ�أ��򷵻� true�� 
    boolean contains(Object o) 
          ����б����ָ����Ԫ�أ��򷵻� true�� 
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("�б��Ƿ�Ϊ�գ�"+list.isEmpty());
		list.add("heiio");
		list.add("kittly");
		list.add("hope");
		list.add("love");
		System.out.println("�������Ƿ���Kitty��Ԫ��"+list.contains("kittly"));
		System.out.println("�������Ƿ���kimi��Ԫ��"+list.contains("kimi"));
		List<String> li = list.subList(1, 3);
		System.out.print("��ȡ2,3֮���Ԫ���ǣ�");
		for (int i = 0; i <li.size(); i++) {
			System.out.print(li.get(i)+"��");
		}
	}

}
